package co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.secundary.establishment;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface JpaEstablishmentRepository extends JpaRepository<EstablishmentEntity, Long>, JpaSpecificationExecutor<EstablishmentEntity> {
    List<EstablishmentEntity> findAllByOperatorId(Long id);
}
