package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.primary.mapper.counterdevice;


import org.mapstruct.Mapper;

import co.com.ies.smolplus.context.moduledevicemanager.domain.counterdevice.CounterDevice;
import co.com.ies.smolplus.context.moduledevicemanager.infrastructure.secondary.counterdevice.CounterDeviceEntity;
import co.com.ies.smolplus.technical.infrastructure.primary.mapper.EntityMapper;


@Mapper(componentModel = "spring")
public interface CounterDeviceEntityMapper extends EntityMapper<CounterDevice, CounterDeviceEntity> {


}
    