package co.com.ies.smolplus.context.moduleeventmanager.insfrastructure.secundary.eventtypemodel;

import org.springframework.stereotype.Repository;

import co.com.ies.smolplus.context.moduleeventmanager.domain.eventtypemodel.EventTypeModelRepository;



@Repository
public class SpringDataEventTypeModelRepository implements EventTypeModelRepository {

  private final JpaEventTypeModelRepository jpaEventTypeRepository;

  public SpringDataEventTypeModelRepository(JpaEventTypeModelRepository jpaEventTypeRepository) {
    this.jpaEventTypeRepository = jpaEventTypeRepository;
  }
}
