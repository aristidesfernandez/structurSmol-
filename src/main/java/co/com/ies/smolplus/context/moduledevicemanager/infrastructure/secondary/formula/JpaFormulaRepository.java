package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.secondary.formula;


import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


@Repository
public interface JpaFormulaRepository extends JpaRepository<FormulaEntity, Long>, JpaSpecificationExecutor<FormulaEntity> {
    
}
