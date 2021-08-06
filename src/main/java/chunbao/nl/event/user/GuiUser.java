package chunbao.nl.event.user;

import chunbao.nl.event.json.BaseJson;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@JsonRootName(value = "user")
@JsonPropertyOrder({"username", "password"})
public class GuiUser extends BaseJson {
  @Id String username;
  String password;

  public GuiUser() {}

  public GuiUser(String username, String password) {
    this.username = username;
    this.password = password;
  }

  @JsonGetter("username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  @JsonGetter("password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public String toString() {
    return "User{" + "username='" + username + '\'' + ", password='" + password + '\'' + '}';
  }
}
