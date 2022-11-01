package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.secondary.interfaceboard;

import org.springframework.stereotype.Repository;
import co.com.ies.smolplus.context.moduledevicemanager.domain.interfaceboard.InterfaceBoardRepository;


@Repository
public class SpringDataInterfaceBoardRepository implements InterfaceBoardRepository {  

  private final JpaInterfaceBoardRepository jpaInterfaceBoardRepository;

  
 
  public SpringDataInterfaceBoardRepository(JpaInterfaceBoardRepository jpaInterfaceBoardRepository) {
    this.jpaInterfaceBoardRepository = jpaInterfaceBoardRepository;

  }


 
}
