package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.secondary.commanddevice;

import org.springframework.stereotype.Repository;
import co.com.ies.smolplus.context.moduledevicemanager.domain.commanddevice.CommandDeviceRepository;


@Repository
public class SpringDataCommandDeviceRepository implements CommandDeviceRepository {  

  private final JpaCommandDeviceRepository jpaCommandDeviceRepository;
  
 
  public SpringDataCommandDeviceRepository(JpaCommandDeviceRepository jpaCommandDeviceRepository) {
    this.jpaCommandDeviceRepository = jpaCommandDeviceRepository;
  }
 
}
