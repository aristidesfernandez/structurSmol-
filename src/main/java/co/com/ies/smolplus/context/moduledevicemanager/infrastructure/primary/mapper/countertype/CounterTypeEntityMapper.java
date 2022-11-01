package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.primary.mapper.countertype;


import org.mapstruct.Mapper;

import co.com.ies.smolplus.context.moduledevicemanager.domain.countertype.CounterType;
import co.com.ies.smolplus.context.moduledevicemanager.infrastructure.secondary.countertype.CounterTypeEntity;
import co.com.ies.smolplus.technical.infrastructure.primary.mapper.EntityMapper;


@Mapper(componentModel = "spring")
public interface CounterTypeEntityMapper extends EntityMapper<CounterType, CounterTypeEntity> {


}
    