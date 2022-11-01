package co.com.ies.smolplus.context.moduleeventmanager.insfrastructure.primary.mapper.eventtypemodel;


import co.com.ies.smolplus.context.moduleeventmanager.domain.eventtypemodel.EventTypeModel;
import co.com.ies.smolplus.dto.moduleeventmanager.EventTypeModelDTO;
import co.com.ies.smolplus.technical.infrastructure.primary.mapper.DomainMapper;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface EventTypeModelMapper extends DomainMapper<EventTypeModelDTO, EventTypeModel> {}
