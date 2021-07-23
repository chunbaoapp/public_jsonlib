package chunbao.nl.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {

    private static ObjectMapper objectMapper =initObjectMapper();

    public static ObjectMapper getObjectMapper() {
        return objectMapper;
    }

    private static ObjectMapper initObjectMapper(){
        ObjectMapper defaultObjectMapper=new ObjectMapper();
        // ... some configuration
        return defaultObjectMapper;
    }

    public static JsonNode parse(String jsonStr) throws JsonProcessingException {
        return objectMapper.readTree(jsonStr);
    }

    public static <T extends BaseJson> T parse(String jsonStr, Class<T> clazz) throws JsonProcessingException {
        return objectMapper.readValue(jsonStr,clazz);
    }

    public static <T extends BaseJson> String toString(T json) throws JsonProcessingException {
        return objectMapper.writeValueAsString(json);
    }
}
