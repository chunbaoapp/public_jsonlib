package chunbao.nl.event.event;

import chunbao.nl.event.json.BaseJson;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "header")
@JsonPropertyOrder({"sender", "version"})
public class Header extends BaseJson {
  private Sender sender;
  private String version;

  @JsonGetter("sender")
  public Sender getSender() {
    return sender;
  }

  public void setSender(Sender sender) {
    this.sender = sender;
  }

  @JsonGetter("version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }
}
