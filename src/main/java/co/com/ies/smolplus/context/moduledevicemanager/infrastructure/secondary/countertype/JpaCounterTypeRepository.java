package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.secondary.countertype;


import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


@Repository
public interface JpaCounterTypeRepository extends JpaRepository<CounterTypeEntity, Long>, JpaSpecificationExecutor<CounterTypeEntity> {
    
}
