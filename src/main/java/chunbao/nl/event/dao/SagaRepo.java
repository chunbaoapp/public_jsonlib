package chunbao.nl.event.dao;

import chunbao.nl.event.saga.Saga;
import org.springframework.data.repository.CrudRepository;

public interface SagaRepo extends CrudRepository<Saga, String> {}
