package co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.primary.mapper.establishment;


import org.mapstruct.Mapper;

import co.com.ies.smolplus.context.moduleestablishmentmanager.domain.establishment.Establishment;
import co.com.ies.smolplus.dto.moduleestablishmentmanager.EstablishmentDTO;
import co.com.ies.smolplus.technical.infrastructure.primary.mapper.DomainMapper;

@Mapper(componentModel = "spring")
public interface EstablishmentMapper extends DomainMapper<EstablishmentDTO, Establishment> {}
