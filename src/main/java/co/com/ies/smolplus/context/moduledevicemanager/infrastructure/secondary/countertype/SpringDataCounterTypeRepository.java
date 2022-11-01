package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.secondary.countertype;

import org.springframework.stereotype.Repository;

import co.com.ies.smolplus.context.moduledevicemanager.domain.countertype.CounterTypeRepository;


@Repository
public class SpringDataCounterTypeRepository implements CounterTypeRepository {  

  private final JpaCounterTypeRepository jpaCounterTypeRepository;
  
 
  public SpringDataCounterTypeRepository(JpaCounterTypeRepository jpaCounterTypeRepository) {
    this.jpaCounterTypeRepository = jpaCounterTypeRepository;

  }
 
}
