package co.com.ies.smolplus.context.modulecentralcommunication.infrastructure.secondary;

import org.springframework.stereotype.Repository;

import co.com.ies.smolplus.context.modulecentralcommunication.domain.CentralCommunicationRepository;

@Repository
public class SpringDataCentralCommunicationRepository implements CentralCommunicationRepository {  

  private final JpaCentralCommunicationRepository jpaDeviceRepository;

  
 
  public SpringDataCentralCommunicationRepository(JpaCentralCommunicationRepository jpaDeviceRepository) {
    this.jpaDeviceRepository = jpaDeviceRepository;

  }


 
}
