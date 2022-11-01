package co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.primary.mapper.operator;

import co.com.ies.smolplus.context.moduleestablishmentmanager.domain.operator.Operator;
import co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.secundary.operator.OperatorEntity;
import co.com.ies.smolplus.technical.infrastructure.primary.mapper.EntityMapper;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface OperatorEntityMapper extends EntityMapper<Operator, OperatorEntity> {}
