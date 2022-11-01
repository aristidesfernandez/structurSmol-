package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.primary.mapper.counterdevice;


import org.mapstruct.Mapper;

import co.com.ies.smolplus.context.moduledevicemanager.domain.counterdevice.CounterDevice;
import co.com.ies.smolplus.dto.moduledevicemanager.CounterDeviceDTO;
import co.com.ies.smolplus.technical.infrastructure.primary.mapper.DomainMapper;


@Mapper(componentModel = "spring")
public interface CounterDeviceMapper extends DomainMapper<CounterDeviceDTO, CounterDevice> {
    
}
    