package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.primary.mapper.formulacountertype;


import org.mapstruct.Mapper;

import co.com.ies.smolplus.context.moduledevicemanager.domain.formulacountertype.FormulaCounterType;
import co.com.ies.smolplus.context.moduledevicemanager.infrastructure.secondary.formulacountertype.FormulaCounterTypeEntity;
import co.com.ies.smolplus.technical.infrastructure.primary.mapper.EntityMapper;


@Mapper(componentModel = "spring")
public interface FormulaCounterTypeEntityMapper extends EntityMapper<FormulaCounterType, FormulaCounterTypeEntity> {


}
    