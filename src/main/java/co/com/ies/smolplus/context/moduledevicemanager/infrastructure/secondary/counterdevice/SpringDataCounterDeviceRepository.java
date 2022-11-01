package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.secondary.counterdevice;

import org.springframework.stereotype.Repository;
import co.com.ies.smolplus.context.moduledevicemanager.domain.counterdevice.CounterDeviceRepository;


@Repository
public class SpringDataCounterDeviceRepository implements CounterDeviceRepository {  

  private final JpaCounterDeviceRepository jpaCounterDeviceRepository;
  
 
  public SpringDataCounterDeviceRepository(JpaCounterDeviceRepository jpaCounterDeviceRepository) {
    this.jpaCounterDeviceRepository = jpaCounterDeviceRepository;
  }
 
}
