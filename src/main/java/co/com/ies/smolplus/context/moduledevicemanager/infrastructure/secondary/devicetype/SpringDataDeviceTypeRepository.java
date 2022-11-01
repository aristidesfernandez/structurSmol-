package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.secondary.devicetype;

import org.springframework.stereotype.Repository;

import co.com.ies.smolplus.context.moduledevicemanager.domain.devicetype.DeviceTypeRepository;





@Repository
public class SpringDataDeviceTypeRepository implements DeviceTypeRepository {  

  private final JpaDeviceTypeRepository jpaDeviceTypeRepository;

 
  public SpringDataDeviceTypeRepository(JpaDeviceTypeRepository jpaDeviceTypeRepository) {
    this.jpaDeviceTypeRepository = jpaDeviceTypeRepository;

  }
 
}
