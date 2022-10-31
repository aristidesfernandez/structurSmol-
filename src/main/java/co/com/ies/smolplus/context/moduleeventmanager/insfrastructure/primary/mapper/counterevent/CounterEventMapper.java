package co.com.ies.smolplus.context.moduleeventmanager.insfrastructure.primary.mapper.counterevent;

import co.com.ies.smolplus.context.moduleeventmanager.domain.counterevent.CounterEvent;
import co.com.ies.smolplus.dto.CounterEventDTO;
import co.com.ies.smolplus.technical.infrastructure.primary.mapper.DomainMapper;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface CounterEventMapper extends DomainMapper<CounterEventDTO, CounterEvent> {}
