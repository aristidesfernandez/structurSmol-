package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.secondary.formulacountertype;


import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


@Repository
public interface JpaFormulaCounterTypeRepository extends JpaRepository<FormulaCounterTypeEntity, Long>, JpaSpecificationExecutor<FormulaCounterTypeEntity> {
    
}
