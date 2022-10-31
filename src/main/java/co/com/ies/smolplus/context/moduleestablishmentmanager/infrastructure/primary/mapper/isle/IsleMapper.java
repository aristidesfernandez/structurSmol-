package co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.primary.mapper.isle;


import co.com.ies.smolplus.context.moduleestablishmentmanager.domain.isle.Isle;
import co.com.ies.smolplus.dto.IsleDTO;
import co.com.ies.smolplus.technical.infrastructure.primary.mapper.DomainMapper;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface IsleMapper extends DomainMapper<IsleDTO, Isle> {}
