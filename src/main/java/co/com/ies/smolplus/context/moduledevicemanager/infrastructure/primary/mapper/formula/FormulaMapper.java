package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.primary.mapper.formula;


import org.mapstruct.Mapper;

import co.com.ies.smolplus.context.moduledevicemanager.domain.formula.Formula;
import co.com.ies.smolplus.dto.moduledevicemanager.FormulaDTO;
import co.com.ies.smolplus.technical.infrastructure.primary.mapper.DomainMapper;


@Mapper(componentModel = "spring")
public interface FormulaMapper extends DomainMapper<FormulaDTO, Formula> {
    
}
    