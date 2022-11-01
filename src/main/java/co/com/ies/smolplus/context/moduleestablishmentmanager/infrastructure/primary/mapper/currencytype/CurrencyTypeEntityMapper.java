package co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.primary.mapper.currencytype;



import co.com.ies.smolplus.context.moduleestablishmentmanager.domain.currencytype.CurrencyType;
import co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.secundary.currencytype.CurrencyTypeEntity;
import co.com.ies.smolplus.technical.infrastructure.primary.mapper.EntityMapper;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface CurrencyTypeEntityMapper extends EntityMapper<CurrencyType, CurrencyTypeEntity> {}
