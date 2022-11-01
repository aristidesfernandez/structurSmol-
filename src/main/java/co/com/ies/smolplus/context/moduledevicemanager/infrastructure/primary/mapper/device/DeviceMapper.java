package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.primary.mapper.device;


import org.mapstruct.Mapper;

import co.com.ies.smolplus.context.moduledevicemanager.domain.device.Device;
import co.com.ies.smolplus.dto.moduledevicemanager.DeviceDTO;
import co.com.ies.smolplus.technical.infrastructure.primary.mapper.DomainMapper;


@Mapper(componentModel = "spring")
public interface DeviceMapper extends DomainMapper<DeviceDTO, Device> {
    
}
    