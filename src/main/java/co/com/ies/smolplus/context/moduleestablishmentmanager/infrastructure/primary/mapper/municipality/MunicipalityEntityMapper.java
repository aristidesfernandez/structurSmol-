package co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.primary.mapper.municipality;

import co.com.ies.smolplus.context.moduleestablishmentmanager.domain.municipality.Municipality;
import co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.secundary.municipality.MunicipalityEntity;
import co.com.ies.smolplus.technical.infrastructure.primary.mapper.EntityMapper;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface MunicipalityEntityMapper extends EntityMapper<Municipality, MunicipalityEntity> {}
