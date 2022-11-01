package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.secondary.commandmodel;

import org.springframework.stereotype.Repository;

import co.com.ies.smolplus.context.moduledevicemanager.domain.commandmodel.CommandModelRepository;


@Repository
public class SpringDataCommandModelRepository implements CommandModelRepository {  

  private final JpaCommandModelRepository jpaCommandModelRepository;
  
 
  public SpringDataCommandModelRepository(JpaCommandModelRepository jpaCommandModelRepository) {
    this.jpaCommandModelRepository = jpaCommandModelRepository;
  }
 
}
