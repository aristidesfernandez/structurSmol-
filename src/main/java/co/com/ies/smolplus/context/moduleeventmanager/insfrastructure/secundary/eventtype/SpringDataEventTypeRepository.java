package co.com.ies.smolplus.context.moduleeventmanager.insfrastructure.secundary.eventtype;

import org.springframework.stereotype.Repository;

import co.com.ies.smolplus.context.moduleeventmanager.domain.eventtype.EventType;
import co.com.ies.smolplus.context.moduleeventmanager.domain.eventtype.EventTypeRepository;
import co.com.ies.smolplus.context.moduleeventmanager.insfrastructure.primary.mapper.eventtype.EventTypeEntityMapper;



@Repository
public class SpringDataEventTypeRepository implements EventTypeRepository {

  private final JpaEventTypeRepository jpaEventTypeRepository;
  private final EventTypeEntityMapper eventTypeEntityMapper;

  public SpringDataEventTypeRepository(JpaEventTypeRepository jpaEventTypeRepository, EventTypeEntityMapper eventTypeEntityMapper) {
    this.jpaEventTypeRepository = jpaEventTypeRepository;
    this.eventTypeEntityMapper = eventTypeEntityMapper;
  }

  @Override
  public EventType create(EventType device) {
    EventTypeEntity eventTypeEntity = eventTypeEntityMapper.toEntity(device);

    return eventTypeEntityMapper.toDomain(jpaEventTypeRepository.save(eventTypeEntity));
  }
}
