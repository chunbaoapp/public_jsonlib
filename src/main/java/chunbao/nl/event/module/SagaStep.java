package chunbao.nl.event.module;


import chunbao.nl.event.json.BaseJson;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "action")
@JsonPropertyOrder({"name", "description"})
public class SagaStep extends BaseJson {

}
