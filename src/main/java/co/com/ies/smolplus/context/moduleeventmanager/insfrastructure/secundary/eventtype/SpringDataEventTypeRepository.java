package co.com.ies.smolplus.context.moduleeventmanager.insfrastructure.secundary.eventtype;

import co.com.ies.smolplus.context.moduleeventmanager.domain.EventManagerRepository;
import org.springframework.stereotype.Repository;

@Repository
public class SpringDataEventTypeRepository implements EventManagerRepository {

  private final JpaEventTypeRepository jpaEventTypeRepository;

  public SpringDataEventTypeRepository(JpaEventTypeRepository jpaEventTypeRepository) {
    this.jpaEventTypeRepository = jpaEventTypeRepository;
  }
}
