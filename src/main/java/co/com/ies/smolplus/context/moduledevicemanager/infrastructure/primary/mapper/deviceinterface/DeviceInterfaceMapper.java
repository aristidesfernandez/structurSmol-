package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.primary.mapper.deviceinterface;


import org.mapstruct.Mapper;

import co.com.ies.smolplus.context.moduledevicemanager.domain.deviceinterface.DeviceInterface;
import co.com.ies.smolplus.dto.moduledevicemanager.DeviceInterfaceDTO;
import co.com.ies.smolplus.technical.infrastructure.primary.mapper.DomainMapper;


@Mapper(componentModel = "spring")
public interface DeviceInterfaceMapper extends DomainMapper<DeviceInterfaceDTO, DeviceInterface> {
    
}
    