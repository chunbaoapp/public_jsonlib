package chunbao.nl.event.dao;

import chunbao.nl.event.saga.SagaTemplate;
import org.springframework.data.repository.CrudRepository;

public interface SagaTemplateRepo extends CrudRepository<SagaTemplate, String> {}
