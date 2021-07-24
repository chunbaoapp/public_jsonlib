package chunbao.nl.event;

import chunbao.nl.json.BaseJson;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "sender")
@JsonPropertyOrder({"name"})
public class Sender implements BaseJson {
  private String name;

  @JsonGetter("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
