package co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.primary.mapper.operationalpropertiesestablishment;

import co.com.ies.smolplus.context.moduleestablishmentmanager.domain.operationalpropertiesestablishment.OperationalPropertiesEstablishment;
import co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.secundary.operationalpropertiesestablishment.OperationalPropertiesEstablishmentEntity;
import co.com.ies.smolplus.technical.infrastructure.primary.mapper.EntityMapper;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface OperationalPropertiesEstablishmentEntityMapper extends EntityMapper<OperationalPropertiesEstablishment, OperationalPropertiesEstablishmentEntity> {}
