package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.primary.mapper;


import org.mapstruct.*;

import co.com.ies.smolplus.context.modulecentralcommunication.domain.CentralCommunication;
import co.com.ies.smolplus.context.modulecentralcommunication.infrastructure.secondary.CentralCommunicationEntity;
import co.com.ies.smolplus.technical.infrastructure.primary.mapper.EntityMapper;


@Mapper(componentModel = "spring")
public interface CentralCommunicationEntityMapper extends EntityMapper<CentralCommunication, CentralCommunicationEntity> {


}
    