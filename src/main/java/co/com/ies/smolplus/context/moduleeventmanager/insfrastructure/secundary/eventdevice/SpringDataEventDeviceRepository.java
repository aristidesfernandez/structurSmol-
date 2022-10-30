package co.com.ies.smolplus.context.moduleeventmanager.insfrastructure.secundary.eventdevice;

import co.com.ies.smolplus.context.moduleeventmanager.domain.EventManagerRepository;
import org.springframework.stereotype.Repository;

@Repository
public class SpringDataEventDeviceRepository implements EventManagerRepository {

  private final JpaEventDeviceRepository jpaEventDeviceRepository;

  public SpringDataEventDeviceRepository(JpaEventDeviceRepository jpaEventDeviceRepository) {
    this.jpaEventDeviceRepository = jpaEventDeviceRepository;
  }
}
