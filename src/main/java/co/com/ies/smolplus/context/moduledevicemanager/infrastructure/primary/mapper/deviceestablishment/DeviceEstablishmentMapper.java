package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.primary.mapper.deviceestablishment;


import org.mapstruct.Mapper;

import co.com.ies.smolplus.context.moduledevicemanager.domain.deviceestablishment.DeviceEstablishment;
import co.com.ies.smolplus.dto.moduledevicemanager.DeviceEstablishmentDTO;
import co.com.ies.smolplus.technical.infrastructure.primary.mapper.DomainMapper;


@Mapper(componentModel = "spring")
public interface DeviceEstablishmentMapper extends DomainMapper<DeviceEstablishmentDTO, DeviceEstablishment> {
    
}
    