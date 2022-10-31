package co.com.ies.smolplus.context.moduleeventmanager.insfrastructure.secundary.eventdevice;

import org.springframework.stereotype.Repository;

import co.com.ies.smolplus.context.moduleeventmanager.domain.eventdevice.EventDeviceRepository;

@Repository
public class SpringDataEventDeviceRepository implements EventDeviceRepository {

  private final JpaEventDeviceRepository jpaEventDeviceRepository;

  public SpringDataEventDeviceRepository(JpaEventDeviceRepository jpaEventDeviceRepository) {
    this.jpaEventDeviceRepository = jpaEventDeviceRepository;
  }
}
