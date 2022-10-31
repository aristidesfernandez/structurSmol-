package co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.primary.mapper.municipality;

import co.com.ies.smolplus.context.moduleestablishmentmanager.domain.municipality.Municipality;
import co.com.ies.smolplus.dto.MunicipalityDTO;
import co.com.ies.smolplus.technical.infrastructure.primary.mapper.DomainMapper;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface MunicipalityMapper extends DomainMapper<MunicipalityDTO, Municipality> {}
