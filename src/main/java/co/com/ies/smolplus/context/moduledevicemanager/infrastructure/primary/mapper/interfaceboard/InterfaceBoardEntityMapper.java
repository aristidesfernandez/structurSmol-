package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.primary.mapper.interfaceboard;


import org.mapstruct.Mapper;

import co.com.ies.smolplus.context.moduledevicemanager.domain.interfaceboard.InterfaceBoard;
import co.com.ies.smolplus.context.moduledevicemanager.infrastructure.secondary.interfaceboard.InterfaceBoardEntity;
import co.com.ies.smolplus.technical.infrastructure.primary.mapper.EntityMapper;


@Mapper(componentModel = "spring")
public interface InterfaceBoardEntityMapper extends EntityMapper<InterfaceBoard, InterfaceBoardEntity> {


}
    