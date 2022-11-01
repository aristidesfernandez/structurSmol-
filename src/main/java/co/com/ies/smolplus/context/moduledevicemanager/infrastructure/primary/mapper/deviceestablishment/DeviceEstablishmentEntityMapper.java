package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.primary.mapper.deviceestablishment;


import org.mapstruct.Mapper;

import co.com.ies.smolplus.context.moduledevicemanager.domain.deviceestablishment.DeviceEstablishment;
import co.com.ies.smolplus.context.moduledevicemanager.infrastructure.secondary.deviceestablishment.DeviceEstablishmentEntity;
import co.com.ies.smolplus.technical.infrastructure.primary.mapper.EntityMapper;


@Mapper(componentModel = "spring")
public interface DeviceEstablishmentEntityMapper extends EntityMapper<DeviceEstablishment, DeviceEstablishmentEntity> {


}
    