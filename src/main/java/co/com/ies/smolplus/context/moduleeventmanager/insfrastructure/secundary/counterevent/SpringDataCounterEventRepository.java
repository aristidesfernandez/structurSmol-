package co.com.ies.smolplus.context.moduleeventmanager.insfrastructure.secundary.counterevent;

import co.com.ies.smolplus.context.moduleeventmanager.domain.counterevent.CounterEvent;
import co.com.ies.smolplus.context.moduleeventmanager.insfrastructure.primary.mapper.counterevent.CounterEventEntityMapper;
import org.springframework.stereotype.Repository;
import co.com.ies.smolplus.context.moduleeventmanager.domain.counterevent.CounterEventRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Repository
public class SpringDataCounterEventRepository implements CounterEventRepository {

  private final JpaCounterEventRepository jpaCounterEventRepository;

  private final CounterEventEntityMapper counterEventEntityMapper;

  public SpringDataCounterEventRepository(JpaCounterEventRepository jpaCounterEventRepository, CounterEventEntityMapper counterEventEntityMapper) {
    this.jpaCounterEventRepository = jpaCounterEventRepository;
    this.counterEventEntityMapper = counterEventEntityMapper;
  }

  @Override
  public List<CounterEvent> getCounterEventByEventDeviceId(UUID id) {
    Optional<List<CounterEventEntity>> counterEventEntityList = jpaCounterEventRepository.findAllByEventDeviceId(id);
    System.out.println("**************** id : "+id);
    System.out.println("**************** counterEventEntityList : "+counterEventEntityList);
    List<CounterEvent> counterEventList = counterEventEntityMapper.toDomain(counterEventEntityList.get());
    System.out.println("**************** counterEventList : "+counterEventList);
    return counterEventList;
  }
}
