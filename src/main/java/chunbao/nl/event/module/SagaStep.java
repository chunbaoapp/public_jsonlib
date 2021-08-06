package chunbao.nl.event.module;

import chunbao.nl.event.json.BaseJson;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "sagaStep")
@JsonPropertyOrder({"transaction", "compensation"})
public class SagaStep extends BaseJson {
  private Transaction transaction;
  private Transaction compensation;

  @JsonGetter("transaction")
  public Transaction getTransaction() {
    return transaction;
  }

  public void setTransaction(Transaction transaction) {
    this.transaction = transaction;
  }

  @JsonGetter("compensation")
  public Transaction getCompensation() {
    return compensation;
  }

  public void setCompensation(Transaction compensation) {
    this.compensation = compensation;
  }
}
