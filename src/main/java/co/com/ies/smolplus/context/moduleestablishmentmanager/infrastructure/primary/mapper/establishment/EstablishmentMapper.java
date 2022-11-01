package co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.primary.mapper.establishment;


import co.com.ies.smolplus.context.moduleestablishmentmanager.domain.country.Country;
import co.com.ies.smolplus.dto.moduleestablishmentmanager.CountryDTO;
import co.com.ies.smolplus.technical.infrastructure.primary.mapper.DomainMapper;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface EstablishmentMapper extends DomainMapper<CountryDTO, Country> {}
