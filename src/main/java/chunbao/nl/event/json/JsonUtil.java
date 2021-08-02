package chunbao.nl.event.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import static org.apache.commons.lang3.StringUtils.isBlank;
import static org.apache.commons.lang3.StringUtils.isNotBlank;

public class JsonUtil {

  private static ObjectMapper objectMapper = initObjectMapper();

  public static ObjectMapper getObjectMapper() {
    return objectMapper;
  }

  private static ObjectMapper initObjectMapper() {
    ObjectMapper defaultObjectMapper = new ObjectMapper();
    // ... some configuration
    return defaultObjectMapper;
  }

  public static JsonNode parse(String jsonStr) throws JsonProcessingException {
    return objectMapper.readTree(jsonStr);
  }

  public static <T extends BaseJson> T parse(String jsonStr, Class<T> clazz)
      throws JsonProcessingException {
    return objectMapper.readValue(jsonStr, clazz);
  }

  public static <T extends BaseJson> String toString(T json) throws JsonProcessingException {
    return objectMapper.writeValueAsString(json);
  }

  public static boolean compareJsonStrings(String jsonA, String jsonB) {
    if (isBlank(jsonA) && isNotBlank(jsonB) || isNotBlank(jsonA) && isBlank(jsonB)) {
      return false;
    } else if (isBlank(jsonA) && isBlank(jsonB)) {
      return true;
    }
    JsonElement jsonElementA = JsonParser.parseString(jsonA).getAsJsonObject();
    JsonElement jsonElementB = JsonParser.parseString(jsonB).getAsJsonObject();
    return jsonElementA == null && jsonElementB != null ? false : jsonElementA.equals(jsonElementB);
  }
}
