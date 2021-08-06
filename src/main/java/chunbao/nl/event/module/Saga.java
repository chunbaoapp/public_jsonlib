package chunbao.nl.event.module;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@JsonRootName(value = "saga")
@JsonPropertyOrder({"eventId", "name", "version", "current", "direction", "steps"})
public class Saga extends SagaBase {
  @Id private String eventId;
  private String name;
  private Integer current;
  private String direction;

  @JsonGetter("eventId")
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  @JsonGetter("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @JsonGetter("current")
  public Integer getCurrent() {
    return current;
  }

  public void setCurrent(Integer current) {
    this.current = current;
  }

  @JsonGetter("direction")
  public String getDirection() {
    return direction;
  }

  public void setDirection(String direction) {
    this.direction = direction;
  }
}
