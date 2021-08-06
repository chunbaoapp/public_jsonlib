package chunbao.nl.event.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.Serializable;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public abstract class BaseJson implements Serializable {
  @Override
  public boolean equals(Object obj) {
    return EqualsBuilder.reflectionEquals(this, obj);
  }

  @Override
  public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(this);
  }

  public String toJsonString() throws JsonProcessingException {
    return JsonUtil.toString(this);
  }
}
