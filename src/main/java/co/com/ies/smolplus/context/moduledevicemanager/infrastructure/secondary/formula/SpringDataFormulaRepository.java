package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.secondary.formula;

import org.springframework.stereotype.Repository;

import co.com.ies.smolplus.context.moduledevicemanager.domain.formula.FormulaRepository;



@Repository
public class SpringDataFormulaRepository implements FormulaRepository {  

  private final JpaFormulaRepository jpaDeviceRepository;
  
 
  public SpringDataFormulaRepository(JpaFormulaRepository jpaDeviceRepository) {
    this.jpaDeviceRepository = jpaDeviceRepository;

  }
 
}
