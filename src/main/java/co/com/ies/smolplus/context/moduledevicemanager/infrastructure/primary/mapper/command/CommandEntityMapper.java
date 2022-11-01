package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.primary.mapper.command;


import org.mapstruct.Mapper;

import co.com.ies.smolplus.context.moduledevicemanager.domain.command.Command;
import co.com.ies.smolplus.context.moduledevicemanager.infrastructure.secondary.command.CommandEntity;
import co.com.ies.smolplus.technical.infrastructure.primary.mapper.EntityMapper;


@Mapper(componentModel = "spring")
public interface CommandEntityMapper extends EntityMapper<Command, CommandEntity> {


}
    