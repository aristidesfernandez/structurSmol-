package co.com.ies.smolplus.context.moduleeventmanager.insfrastructure.primary.mapper.counterevent;


import co.com.ies.smolplus.context.moduleeventmanager.domain.counterevent.CounterEvent;
import co.com.ies.smolplus.context.moduleeventmanager.insfrastructure.secundary.counterevent.CounterEventEntity;
import co.com.ies.smolplus.technical.infrastructure.primary.mapper.EntityMapper;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface CounterEventEntityMapper extends EntityMapper<CounterEvent, CounterEventEntity> {}
