package co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.primary.mapper.country;


import co.com.ies.smolplus.context.moduleestablishmentmanager.domain.country.Country;
import co.com.ies.smolplus.dto.CountryDTO;
import co.com.ies.smolplus.technical.infrastructure.primary.mapper.DomainMapper;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface CountryMapper extends DomainMapper<CountryDTO, Country> {}
