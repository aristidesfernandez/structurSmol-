package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.secondary.device;

import org.springframework.stereotype.Repository;
import co.com.ies.smolplus.context.moduledevicemanager.domain.device.DeviceRepository;


@Repository
public class SpringDataDeviceRepository implements DeviceRepository {  

  private final JpaDeviceRepository jpaDeviceRepository;
  
 
  public SpringDataDeviceRepository(JpaDeviceRepository jpaDeviceRepository) {
    this.jpaDeviceRepository = jpaDeviceRepository;

  }
 
}
