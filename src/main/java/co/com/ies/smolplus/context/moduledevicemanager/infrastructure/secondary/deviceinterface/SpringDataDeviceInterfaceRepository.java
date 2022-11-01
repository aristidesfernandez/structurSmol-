package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.secondary.deviceinterface;

import org.springframework.stereotype.Repository;
import co.com.ies.smolplus.context.moduledevicemanager.domain.deviceinterface.DeviceInterfaceRepository;


@Repository
public class SpringDataDeviceInterfaceRepository implements DeviceInterfaceRepository {  

  private final JpaDeviceInterfaceRepository jpaDeviceInterfaceRepository;

  
 
  public SpringDataDeviceInterfaceRepository(JpaDeviceInterfaceRepository jpaDeviceInterfaceRepository) {
    this.jpaDeviceInterfaceRepository = jpaDeviceInterfaceRepository;

  }


 
}
