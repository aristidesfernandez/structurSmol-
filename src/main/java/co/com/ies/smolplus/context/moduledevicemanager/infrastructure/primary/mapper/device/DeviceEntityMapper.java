package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.primary.mapper.device;


import org.mapstruct.Mapper;

import co.com.ies.smolplus.context.moduledevicemanager.domain.device.Device;
import co.com.ies.smolplus.context.moduledevicemanager.infrastructure.secondary.device.DeviceEntity;
import co.com.ies.smolplus.technical.infrastructure.primary.mapper.EntityMapper;


@Mapper(componentModel = "spring")
public interface DeviceEntityMapper extends EntityMapper<Device, DeviceEntity> {


}
    