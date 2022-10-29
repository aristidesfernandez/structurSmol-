package co.com.ies.smolplus.context.modulecentralcommunication.infrastructure.secondary;


import java.util.UUID;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


@Repository
public interface JpaCentralCommunicationRepository extends JpaRepository<CentralCommunicationEntity, UUID>, JpaSpecificationExecutor<CentralCommunicationEntity> {
    
}
