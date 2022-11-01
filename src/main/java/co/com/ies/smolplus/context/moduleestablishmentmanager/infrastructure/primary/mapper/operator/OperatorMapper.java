package co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.primary.mapper.operator;

import co.com.ies.smolplus.context.moduleestablishmentmanager.domain.operator.Operator;
import co.com.ies.smolplus.dto.moduleestablishmentmanager.OperatorDTO;
import co.com.ies.smolplus.technical.infrastructure.primary.mapper.DomainMapper;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface OperatorMapper extends DomainMapper<OperatorDTO, Operator> {}
