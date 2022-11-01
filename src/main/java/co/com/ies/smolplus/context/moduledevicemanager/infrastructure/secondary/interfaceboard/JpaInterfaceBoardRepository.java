package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.secondary.interfaceboard;


import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


@Repository
public interface JpaInterfaceBoardRepository extends JpaRepository<InterfaceBoardEntity, Long>, JpaSpecificationExecutor<InterfaceBoardEntity> {
    
}
