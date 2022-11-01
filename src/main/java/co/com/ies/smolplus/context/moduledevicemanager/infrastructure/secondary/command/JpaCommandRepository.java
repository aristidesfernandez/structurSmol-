package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.secondary.command;


import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


@Repository
public interface JpaCommandRepository extends JpaRepository<CommandEntity, Long>, JpaSpecificationExecutor<CommandEntity> {
    
}
