package co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.primary.mapper.establishment;


import org.mapstruct.Mapper;

import co.com.ies.smolplus.context.moduleestablishmentmanager.domain.establishment.Establishment;
import co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.secundary.establishment.EstablishmentEntity;
import co.com.ies.smolplus.technical.infrastructure.primary.mapper.EntityMapper;

@Mapper(componentModel = "spring")
public interface EstablishmentEntityMapper extends EntityMapper<Establishment, EstablishmentEntity> {}
