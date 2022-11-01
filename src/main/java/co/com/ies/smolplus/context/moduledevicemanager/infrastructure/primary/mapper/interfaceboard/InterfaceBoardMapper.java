package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.primary.mapper.interfaceboard;


import org.mapstruct.Mapper;

import co.com.ies.smolplus.context.moduledevicemanager.domain.interfaceboard.InterfaceBoard;
import co.com.ies.smolplus.dto.moduledevicemanager.InterfaceBoardDTO;
import co.com.ies.smolplus.technical.infrastructure.primary.mapper.DomainMapper;


@Mapper(componentModel = "spring")
public interface InterfaceBoardMapper extends DomainMapper<InterfaceBoardDTO, InterfaceBoard> {
    
}
    