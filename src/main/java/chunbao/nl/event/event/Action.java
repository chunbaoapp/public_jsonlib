package chunbao.nl.event.event;

import chunbao.nl.event.json.BaseJson;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "action")
@JsonPropertyOrder({"name", "description"})
public class Action extends BaseJson {
  private String name;
  private String description;

  @JsonGetter("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @JsonGetter("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
