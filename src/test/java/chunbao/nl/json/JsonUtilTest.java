package chunbao.nl.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JsonUtilTest {
  @Test
  public void testParse() throws JsonProcessingException {
    JsonNode jsonNode = JsonUtil.parse("{\"name\": \"value\"}");
    assertEquals("value", jsonNode.get("name").asText());
  }

  @Test
  public void testCompareJsonStrings() {
    String jsonA = "{\"name2\": \"value2\",\"name1\": \"value1\"}";
    String jsonB = "{\"name1\": \"value1\",\"name2\": \"value2\"}";
    assertTrue(JsonUtil.compareJsonStrings(jsonA, jsonA));
    assertTrue(JsonUtil.compareJsonStrings(jsonA, jsonB));
    assertFalse(JsonUtil.compareJsonStrings(null, jsonB));
    assertTrue(JsonUtil.compareJsonStrings(null, null));
  }
}
