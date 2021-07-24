package chunbao.nl.event;

import chunbao.nl.json.BaseJson;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "event")
@JsonPropertyOrder({"id", "header", "interAction", "body", "timestamp"})
public class Event extends BaseJson {
  // uuid
  private String id;
  private Header header;
  private InterAction interAction;
  private Body body;
  private String timestamp;

  @JsonGetter("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @JsonGetter("header")
  public Header getHeader() {
    return header;
  }

  public void setHeader(Header header) {
    this.header = header;
  }

  @JsonGetter("interAction")
  public InterAction getInterAction() {
    return interAction;
  }

  public void setInterAction(InterAction interAction) {
    this.interAction = interAction;
  }

  @JsonGetter("body")
  public Body getBody() {
    return body;
  }

  public void setBody(Body body) {
    this.body = body;
  }

  @JsonGetter("timestamp")
  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }
}
