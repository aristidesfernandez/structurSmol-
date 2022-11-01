package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.primary.mapper.formulacountertype;


import org.mapstruct.Mapper;

import co.com.ies.smolplus.context.moduledevicemanager.domain.formulacountertype.FormulaCounterType;
import co.com.ies.smolplus.dto.moduledevicemanager.FormulaCounterTypeDTO;
import co.com.ies.smolplus.technical.infrastructure.primary.mapper.DomainMapper;


@Mapper(componentModel = "spring")
public interface FormulaCounterTypeMapper extends DomainMapper<FormulaCounterTypeDTO, FormulaCounterType> {
    
}
    