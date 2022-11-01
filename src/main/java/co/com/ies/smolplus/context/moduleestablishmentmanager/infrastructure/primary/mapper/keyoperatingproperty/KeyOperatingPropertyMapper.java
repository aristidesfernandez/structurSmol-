package co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.primary.mapper.keyoperatingproperty;

import co.com.ies.smolplus.context.moduleestablishmentmanager.domain.keyoperatingproperty.KeyOperatingProperty;
import co.com.ies.smolplus.dto.moduleestablishmentmanager.KeyOperatingPropertyDTO;
import co.com.ies.smolplus.technical.infrastructure.primary.mapper.DomainMapper;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface KeyOperatingPropertyMapper extends DomainMapper<KeyOperatingPropertyDTO, KeyOperatingProperty> {}
