package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.secondary.commanddevice;


import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


@Repository
public interface JpaCommandDeviceRepository extends JpaRepository<CommandDeviceEntity, Long>, JpaSpecificationExecutor<CommandDeviceEntity> {
    
}
