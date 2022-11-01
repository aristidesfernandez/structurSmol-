package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.primary.mapper.commanddevice;


import org.mapstruct.Mapper;

import co.com.ies.smolplus.context.moduledevicemanager.domain.commanddevice.CommandDevice;
import co.com.ies.smolplus.dto.moduledevicemanager.CommandDeviceDTO;
import co.com.ies.smolplus.technical.infrastructure.primary.mapper.DomainMapper;


@Mapper(componentModel = "spring")
public interface CommandDeviceMapper extends DomainMapper<CommandDeviceDTO, CommandDevice> {
    
}
    