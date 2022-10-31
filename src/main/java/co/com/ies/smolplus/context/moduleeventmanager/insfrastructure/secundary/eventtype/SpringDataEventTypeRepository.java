package co.com.ies.smolplus.context.moduleeventmanager.insfrastructure.secundary.eventtype;

import org.springframework.stereotype.Repository;

import co.com.ies.smolplus.context.moduleeventmanager.domain.eventtype.EventTypeRepository;



@Repository
public class SpringDataEventTypeRepository implements EventTypeRepository {

  private final JpaEventTypeRepository jpaEventTypeRepository;

  public SpringDataEventTypeRepository(JpaEventTypeRepository jpaEventTypeRepository) {
    this.jpaEventTypeRepository = jpaEventTypeRepository;
  }
}
