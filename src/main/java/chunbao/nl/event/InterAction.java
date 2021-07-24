package chunbao.nl.event;

import chunbao.nl.json.BaseJson;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "interAction")
@JsonPropertyOrder({"eventId", "responseId", "type", "result"})
public class InterAction implements BaseJson {
  private String eventId;
  private String responseId;
  private String type;
  private String result;

  @JsonGetter("eventId")
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  @JsonGetter("responseId")
  public String getResponseId() {
    return responseId;
  }

  public void setResponseId(String responseId) {
    this.responseId = responseId;
  }

  @JsonGetter("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @JsonGetter("result")
  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }
}
