package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.primary.mapper.devicecategory;


import org.mapstruct.Mapper;

import co.com.ies.smolplus.context.moduledevicemanager.domain.devicecategory.DeviceCategory;
import co.com.ies.smolplus.context.moduledevicemanager.infrastructure.secondary.devicecategory.DeviceCategoryEntity;
import co.com.ies.smolplus.technical.infrastructure.primary.mapper.EntityMapper;


@Mapper(componentModel = "spring")
public interface DeviceCategoryEntityMapper extends EntityMapper<DeviceCategory, DeviceCategoryEntity> {


}
    