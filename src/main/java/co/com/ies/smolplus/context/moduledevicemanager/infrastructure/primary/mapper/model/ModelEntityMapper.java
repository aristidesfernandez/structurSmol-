package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.primary.mapper.model;


import org.mapstruct.Mapper;

import co.com.ies.smolplus.context.moduledevicemanager.domain.model.Model;
import co.com.ies.smolplus.context.moduledevicemanager.infrastructure.secondary.model.ModelEntity;
import co.com.ies.smolplus.technical.infrastructure.primary.mapper.EntityMapper;


@Mapper(componentModel = "spring")
public interface ModelEntityMapper extends EntityMapper<Model, ModelEntity> {


}
    