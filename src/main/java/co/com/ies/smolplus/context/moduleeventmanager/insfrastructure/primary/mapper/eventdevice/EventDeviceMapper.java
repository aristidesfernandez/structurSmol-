package co.com.ies.smolplus.context.moduleeventmanager.insfrastructure.primary.mapper.eventdevice;


import co.com.ies.smolplus.context.moduleeventmanager.domain.eventdevice.EventDevice;
import co.com.ies.smolplus.dto.moduleeventmanager.EventDeviceDTO;
import co.com.ies.smolplus.technical.infrastructure.primary.mapper.DomainMapper;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface EventDeviceMapper extends DomainMapper<EventDeviceDTO, EventDevice> {}
