package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.primary.mapper.deviceinterface;


import org.mapstruct.Mapper;

import co.com.ies.smolplus.context.moduledevicemanager.domain.deviceinterface.DeviceInterface;
import co.com.ies.smolplus.context.moduledevicemanager.infrastructure.secondary.deviceinterface.DeviceInterfaceEntity;
import co.com.ies.smolplus.technical.infrastructure.primary.mapper.EntityMapper;


@Mapper(componentModel = "spring")
public interface DeviceInterfaceEntityMapper extends EntityMapper<DeviceInterface, DeviceInterfaceEntity> {


}
    