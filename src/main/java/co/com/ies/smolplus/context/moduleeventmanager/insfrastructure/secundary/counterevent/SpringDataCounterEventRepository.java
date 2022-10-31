package co.com.ies.smolplus.context.moduleeventmanager.insfrastructure.secundary.counterevent;

import org.springframework.stereotype.Repository;
import co.com.ies.smolplus.context.moduleeventmanager.domain.counterevent.CounterEventRepository;


@Repository
public class SpringDataCounterEventRepository implements CounterEventRepository {

  private final JpaCounterEventRepository jpaCounterEventRepository;

  public SpringDataCounterEventRepository(JpaCounterEventRepository jpaCounterEventRepository) {
    this.jpaCounterEventRepository = jpaCounterEventRepository;
  }
}
