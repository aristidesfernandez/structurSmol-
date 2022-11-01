package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.secondary.counterdevice;


import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


@Repository
public interface JpaCounterDeviceRepository extends JpaRepository<CounterDeviceEntity, Long>, JpaSpecificationExecutor<CounterDeviceEntity> {
    
}
