package co.com.ies.smolplus.context.moduleeventmanager.insfrastructure.primary.mapper.eventdevice;


import co.com.ies.smolplus.context.moduleeventmanager.domain.eventdevice.EventDevice;
import co.com.ies.smolplus.context.moduleeventmanager.insfrastructure.secundary.eventdevice.EventDeviceEntity;
import co.com.ies.smolplus.technical.infrastructure.primary.mapper.EntityMapper;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface EventDeviceEntityMapper extends EntityMapper<EventDevice, EventDeviceEntity> {}
