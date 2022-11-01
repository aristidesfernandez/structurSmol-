package co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.secundary.currencytype;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaCurrencyTypeRepository extends JpaRepository<CurrencyTypeEntity, Long>, JpaSpecificationExecutor<CurrencyTypeEntity> {}
