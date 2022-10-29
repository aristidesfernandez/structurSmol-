package co.com.ies.smolplus.context.modulecentralcommunication.infrastructure.primary.mapper;


import org.mapstruct.*;

import co.com.ies.smolplus.context.modulecentralcommunication.domain.CentralCommunication;
import co.com.ies.smolplus.context.modulecentralcommunication.infrastructure.primary.dto.CentralCommunicationDTO;
import co.com.ies.smolplus.technical.infrastructure.primary.mapper.DomainMapper;


@Mapper(componentModel = "spring")
public interface CentralCommunicationMapper extends DomainMapper<CentralCommunicationDTO, CentralCommunication> {
    
}
    