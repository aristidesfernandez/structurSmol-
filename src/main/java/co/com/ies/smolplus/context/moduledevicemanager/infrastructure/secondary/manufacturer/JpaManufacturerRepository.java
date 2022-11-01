package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.secondary.manufacturer;


import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


@Repository
public interface JpaManufacturerRepository extends JpaRepository<ManufacturerEntity, Long>, JpaSpecificationExecutor<ManufacturerEntity> {
    
}
