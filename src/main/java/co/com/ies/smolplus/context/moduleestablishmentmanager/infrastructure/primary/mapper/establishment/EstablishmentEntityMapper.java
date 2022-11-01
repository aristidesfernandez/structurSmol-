package co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.primary.mapper.establishment;


import co.com.ies.smolplus.context.moduleestablishmentmanager.domain.country.Country;
import co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.secundary.country.CountryEntity;
import co.com.ies.smolplus.technical.infrastructure.primary.mapper.EntityMapper;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface EstablishmentEntityMapper extends EntityMapper<Country, CountryEntity> {}
