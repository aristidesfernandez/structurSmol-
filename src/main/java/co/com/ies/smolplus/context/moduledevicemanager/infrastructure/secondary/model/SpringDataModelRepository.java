package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.secondary.model;

import org.springframework.stereotype.Repository;

import co.com.ies.smolplus.context.moduledevicemanager.domain.model.ModelRepository;



@Repository
public class SpringDataModelRepository implements ModelRepository {  

  private final JpaModelRepository jpaModelRepository;


  public SpringDataModelRepository(JpaModelRepository jpaModelRepository) {
    this.jpaModelRepository = jpaModelRepository;
  }

 
}
