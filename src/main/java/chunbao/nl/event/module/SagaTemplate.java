package chunbao.nl.event.module;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@JsonRootName(value = "sagaTemplate")
@JsonPropertyOrder({"name", "version", "steps"})
public class SagaTemplate extends SagaBase {
  @Id private String name;

  @JsonGetter("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
