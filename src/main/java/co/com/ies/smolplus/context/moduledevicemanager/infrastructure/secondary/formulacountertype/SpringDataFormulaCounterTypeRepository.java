package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.secondary.formulacountertype;

import org.springframework.stereotype.Repository;
import co.com.ies.smolplus.context.moduledevicemanager.domain.formulacountertype.FormulaCounterTypeRepository;


@Repository
public class SpringDataFormulaCounterTypeRepository implements FormulaCounterTypeRepository {  

  private final JpaFormulaCounterTypeRepository jpaFormulaCounterTypeRepository;
  
 
  public SpringDataFormulaCounterTypeRepository(JpaFormulaCounterTypeRepository jpaFormulaCounterTypeRepository) {
    this.jpaFormulaCounterTypeRepository = jpaFormulaCounterTypeRepository;
  }
 
}
