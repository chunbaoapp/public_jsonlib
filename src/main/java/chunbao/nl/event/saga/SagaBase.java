package chunbao.nl.event.saga;

import chunbao.nl.event.json.BaseJson;
import com.fasterxml.jackson.annotation.JsonGetter;

public class SagaBase extends BaseJson {
  private String version;
  private SagaStep[] steps;

  @JsonGetter("version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  @JsonGetter("steps")
  public SagaStep[] getSteps() {
    return steps;
  }

  public void setSteps(SagaStep[] steps) {
    this.steps = steps;
  }
}
