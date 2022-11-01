package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.primary.mapper.formula;


import org.mapstruct.Mapper;

import co.com.ies.smolplus.context.moduledevicemanager.domain.formula.Formula;
import co.com.ies.smolplus.context.moduledevicemanager.infrastructure.secondary.formula.FormulaEntity;
import co.com.ies.smolplus.technical.infrastructure.primary.mapper.EntityMapper;


@Mapper(componentModel = "spring")
public interface FormulaEntityMapper extends EntityMapper<Formula, FormulaEntity> {


}
    