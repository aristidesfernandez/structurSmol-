package co.com.ies.smolplus.context.moduleusermanager.infrastructure.secondary;


import java.util.UUID;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


@Repository
public interface JpaUserAccessRepository extends JpaRepository<UserAccessEntity, UUID>, JpaSpecificationExecutor<UserAccessEntity> {
    
}
