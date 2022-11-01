package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.secondary.command;

import org.springframework.stereotype.Repository;

import co.com.ies.smolplus.context.moduledevicemanager.domain.command.CommandRepository;


@Repository
public class SpringDataCommandRepository implements CommandRepository {  

  private final JpaCommandRepository jpaCommandRepository;
  
 
  public SpringDataCommandRepository(JpaCommandRepository jpaCommandRepository) {
    this.jpaCommandRepository = jpaCommandRepository;
  }
 
}
