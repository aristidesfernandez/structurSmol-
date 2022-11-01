package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.primary.mapper.devicetype;


import org.mapstruct.Mapper;

import co.com.ies.smolplus.context.moduledevicemanager.domain.devicetype.DeviceType;
import co.com.ies.smolplus.context.moduledevicemanager.infrastructure.secondary.devicetype.DeviceTypeEntity;
import co.com.ies.smolplus.technical.infrastructure.primary.mapper.EntityMapper;


@Mapper(componentModel = "spring")
public interface DeviceTypeEntityMapper extends EntityMapper<DeviceType, DeviceTypeEntity> {


}
    