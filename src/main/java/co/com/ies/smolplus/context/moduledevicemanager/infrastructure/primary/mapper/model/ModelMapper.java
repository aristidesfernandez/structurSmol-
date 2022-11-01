package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.primary.mapper.model;


import org.mapstruct.Mapper;

import co.com.ies.smolplus.context.moduledevicemanager.domain.model.Model;
import co.com.ies.smolplus.dto.moduledevicemanager.ModelDTO;
import co.com.ies.smolplus.technical.infrastructure.primary.mapper.DomainMapper;


@Mapper(componentModel = "spring")
public interface ModelMapper extends DomainMapper<ModelDTO, Model> {
    
}
    