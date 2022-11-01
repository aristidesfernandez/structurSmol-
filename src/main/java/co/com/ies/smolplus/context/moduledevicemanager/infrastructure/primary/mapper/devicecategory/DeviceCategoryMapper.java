package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.primary.mapper.devicecategory;


import org.mapstruct.Mapper;

import co.com.ies.smolplus.context.moduledevicemanager.domain.devicecategory.DeviceCategory;
import co.com.ies.smolplus.dto.moduledevicemanager.DeviceCategoryDTO;
import co.com.ies.smolplus.technical.infrastructure.primary.mapper.DomainMapper;


@Mapper(componentModel = "spring")
public interface DeviceCategoryMapper extends DomainMapper<DeviceCategoryDTO, DeviceCategory> {
    
}
    