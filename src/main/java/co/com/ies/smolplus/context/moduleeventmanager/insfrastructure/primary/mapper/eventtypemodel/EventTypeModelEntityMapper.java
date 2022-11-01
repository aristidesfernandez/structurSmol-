package co.com.ies.smolplus.context.moduleeventmanager.insfrastructure.primary.mapper.eventtypemodel;


import co.com.ies.smolplus.context.moduleeventmanager.domain.eventtypemodel.EventTypeModel;
import co.com.ies.smolplus.context.moduleeventmanager.insfrastructure.secundary.eventtypemodel.EventTypeModelEntity;
import co.com.ies.smolplus.technical.infrastructure.primary.mapper.EntityMapper;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface EventTypeModelEntityMapper extends EntityMapper<EventTypeModel, EventTypeModelEntity> {}
