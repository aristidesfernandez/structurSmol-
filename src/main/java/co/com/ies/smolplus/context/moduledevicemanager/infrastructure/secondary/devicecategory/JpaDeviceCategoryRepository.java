package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.secondary.devicecategory;


import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


@Repository
public interface JpaDeviceCategoryRepository extends JpaRepository<DeviceCategoryEntity, Long>, JpaSpecificationExecutor<DeviceCategoryEntity> {
    
}
