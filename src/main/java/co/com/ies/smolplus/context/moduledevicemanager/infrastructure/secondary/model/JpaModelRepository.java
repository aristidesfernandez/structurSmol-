package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.secondary.model;


import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


@Repository
public interface JpaModelRepository extends JpaRepository<ModelEntity, Long>, JpaSpecificationExecutor<ModelEntity> {
    
}
