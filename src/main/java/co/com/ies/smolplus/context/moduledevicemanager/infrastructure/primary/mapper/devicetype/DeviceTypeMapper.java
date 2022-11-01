package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.primary.mapper.devicetype;


import org.mapstruct.Mapper;

import co.com.ies.smolplus.context.moduledevicemanager.domain.devicetype.DeviceType;
import co.com.ies.smolplus.dto.moduledevicemanager.DeviceTypeDTO;
import co.com.ies.smolplus.technical.infrastructure.primary.mapper.DomainMapper;


@Mapper(componentModel = "spring")
public interface DeviceTypeMapper extends DomainMapper<DeviceTypeDTO, DeviceType> {
    
}
    