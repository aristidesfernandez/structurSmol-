package co.com.ies.smolplus.context.moduleeventmanager.insfrastructure.primary.mapper.eventtype;

import co.com.ies.smolplus.context.moduleeventmanager.domain.eventtype.EventType;
import co.com.ies.smolplus.dto.moduleeventmanager.EventTypeDTO;
import co.com.ies.smolplus.technical.infrastructure.primary.mapper.DomainMapper;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface EventTypeMapper extends DomainMapper<EventTypeDTO, EventType> {}
