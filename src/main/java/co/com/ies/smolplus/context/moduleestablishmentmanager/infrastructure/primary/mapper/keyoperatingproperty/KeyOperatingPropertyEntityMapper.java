package co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.primary.mapper.keyoperatingproperty;

import co.com.ies.smolplus.context.moduleestablishmentmanager.domain.keyoperatingproperty.KeyOperatingProperty;
import co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.secundary.keyoperatingproperty.KeyOperatingPropertyEntity;
import co.com.ies.smolplus.technical.infrastructure.primary.mapper.EntityMapper;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface KeyOperatingPropertyEntityMapper extends EntityMapper<KeyOperatingProperty, KeyOperatingPropertyEntity> {}
