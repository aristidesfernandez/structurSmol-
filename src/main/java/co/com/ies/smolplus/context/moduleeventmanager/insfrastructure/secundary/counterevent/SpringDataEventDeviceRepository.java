package co.com.ies.smolplus.context.moduleeventmanager.insfrastructure.secundary.counterevent;

import co.com.ies.smolplus.context.moduleeventmanager.domain.EventManagerRepository;
import org.springframework.stereotype.Repository;

@Repository
public class SpringDataEventDeviceRepository implements EventManagerRepository {

  private final JpaCounterEventRepository jpaCounterEventRepository;

  public SpringDataEventDeviceRepository(JpaCounterEventRepository jpaCounterEventRepository) {
    this.jpaCounterEventRepository = jpaCounterEventRepository;
  }
}
