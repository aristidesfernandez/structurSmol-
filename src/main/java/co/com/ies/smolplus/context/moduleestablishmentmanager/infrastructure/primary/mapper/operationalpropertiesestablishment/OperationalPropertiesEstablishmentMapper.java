package co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.primary.mapper.operationalpropertiesestablishment;

import co.com.ies.smolplus.context.moduleestablishmentmanager.domain.operationalpropertiesestablishment.OperationalPropertiesEstablishment;
import co.com.ies.smolplus.dto.moduleestablishmentmanager.OperationalPropertiesEstablishmentDTO;
import co.com.ies.smolplus.technical.infrastructure.primary.mapper.DomainMapper;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface OperationalPropertiesEstablishmentMapper extends DomainMapper<OperationalPropertiesEstablishmentDTO, OperationalPropertiesEstablishment> {}
