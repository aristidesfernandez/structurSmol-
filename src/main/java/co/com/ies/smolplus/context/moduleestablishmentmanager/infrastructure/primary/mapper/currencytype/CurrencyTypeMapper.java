package co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.primary.mapper.currencytype;



import co.com.ies.smolplus.context.moduleestablishmentmanager.domain.currencytype.CurrencyType;
import co.com.ies.smolplus.dto.moduleestablishmentmanager.CurrencyTypeDTO;
import co.com.ies.smolplus.technical.infrastructure.primary.mapper.DomainMapper;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface CurrencyTypeMapper extends DomainMapper<CurrencyTypeDTO, CurrencyType> {}
