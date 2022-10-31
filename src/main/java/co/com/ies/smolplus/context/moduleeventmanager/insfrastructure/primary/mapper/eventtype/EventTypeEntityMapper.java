package co.com.ies.smolplus.context.moduleeventmanager.insfrastructure.primary.mapper.eventtype;

import co.com.ies.smolplus.context.moduleeventmanager.domain.eventtype.EventType;
import co.com.ies.smolplus.context.moduleeventmanager.insfrastructure.secundary.eventtype.EventTypeEntity;
import co.com.ies.smolplus.technical.infrastructure.primary.mapper.EntityMapper;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface EventTypeEntityMapper extends EntityMapper<EventType, EventTypeEntity> {}
