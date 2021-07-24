package chunbao.nl.json;

import chunbao.nl.event.*;
import chunbao.nl.util.FileUtil;
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

  @Test
  public void testParseObject() throws JsonProcessingException {
    String text = FileUtil.readFileFromClassPathAsString("event-example.json");
    assertNotNull(text);

    Event event = JsonUtil.parse(text, Event.class);
    assertEquals(prepareExpectedEvent(), event);
  }

  @Test
  public void testMarshalling() throws JsonProcessingException {
    String text = FileUtil.readFileFromClassPathAsString("event-example.json");
    assertNotNull(text);
    Event event = prepareExpectedEvent();
    String expectedString = event.toJsonString();
    assertTrue(JsonUtil.compareJsonStrings(text, expectedString));
  }

  private Event prepareExpectedEvent() {
    Event expectedEvent = new Event();

    expectedEvent.setId("uuid");

    Header header = new Header();
    Sender sender = new Sender();
    sender.setName("name");
    header.setSender(sender);
    header.setVersion("1.0");
    expectedEvent.setHeader(header);

    InterAction interAction = new InterAction();
    interAction.setEventId("eventId");
    interAction.setResponseId("responseId");
    interAction.setType("demand or response");
    interAction.setResult("ok or fail for response, null for demand");
    expectedEvent.setInterAction(interAction);

    Body body = new Body();
    Action action = new Action();
    action.setName("name");
    action.setDescription("description");
    body.setAction(action);
    body.setPayload("payload");
    expectedEvent.setBody(body);

    expectedEvent.setTimestamp("2000-01-01T12:00:00.000+1:00");
    return expectedEvent;
  }
}
