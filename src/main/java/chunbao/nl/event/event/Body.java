package chunbao.nl.event.event;

import chunbao.nl.event.json.BaseJson;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRawValue;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "body")
@JsonPropertyOrder({"action", "payload"})
public class Body extends BaseJson {
  private Action action;
  @JsonRawValue private String payload;

  @JsonGetter("action")
  public Action getAction() {
    return action;
  }

  public void setAction(Action action) {
    this.action = action;
  }

  @JsonGetter("payload")
  public String getPayload() {
    return payload;
  }

  public void setPayload(String payload) {
    this.payload = payload;
  }
}
