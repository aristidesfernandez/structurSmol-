package co.com.ies.smolplus.context.moduleusermanager.infrastructure.primary.mapper;


import org.mapstruct.Mapper;

import co.com.ies.smolplus.context.moduleusermanager.domain.useraccess.UserAccess;
import co.com.ies.smolplus.dto.modulousermanager.UserAccessDTO;
import co.com.ies.smolplus.technical.infrastructure.primary.mapper.DomainMapper;


@Mapper(componentModel = "spring")
public interface UserAccessMapper extends DomainMapper<UserAccessDTO, UserAccess> {
    
}
    