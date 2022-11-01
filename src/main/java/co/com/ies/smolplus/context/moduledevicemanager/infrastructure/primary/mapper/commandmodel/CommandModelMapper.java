package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.primary.mapper.commandmodel;


import org.mapstruct.Mapper;

import co.com.ies.smolplus.context.moduledevicemanager.domain.commandmodel.CommandModel;
import co.com.ies.smolplus.dto.moduledevicemanager.CommandModelDTO;
import co.com.ies.smolplus.technical.infrastructure.primary.mapper.DomainMapper;


@Mapper(componentModel = "spring")
public interface CommandModelMapper extends DomainMapper<CommandModelDTO, CommandModel> {
    
}
    