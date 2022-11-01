package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.primary.mapper.command;


import org.mapstruct.Mapper;

import co.com.ies.smolplus.context.moduledevicemanager.domain.command.Command;
import co.com.ies.smolplus.dto.moduledevicemanager.CommandDTO;
import co.com.ies.smolplus.technical.infrastructure.primary.mapper.DomainMapper;


@Mapper(componentModel = "spring")
public interface CommandMapper extends DomainMapper<CommandDTO, Command> {
    
}
    