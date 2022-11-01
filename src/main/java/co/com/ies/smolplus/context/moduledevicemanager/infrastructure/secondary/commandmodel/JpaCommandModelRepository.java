package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.secondary.commandmodel;


import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


@Repository
public interface JpaCommandModelRepository extends JpaRepository<CommandModelEntity, Long>, JpaSpecificationExecutor<CommandModelEntity> {
    
}
