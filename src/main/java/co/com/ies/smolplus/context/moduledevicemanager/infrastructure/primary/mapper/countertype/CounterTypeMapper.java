package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.primary.mapper.countertype;


import org.mapstruct.Mapper;

import co.com.ies.smolplus.context.moduledevicemanager.domain.countertype.CounterType;
import co.com.ies.smolplus.dto.moduledevicemanager.CounterTypeDTO;
import co.com.ies.smolplus.technical.infrastructure.primary.mapper.DomainMapper;


@Mapper(componentModel = "spring")
public interface CounterTypeMapper extends DomainMapper<CounterTypeDTO, CounterType> {
    
}
    