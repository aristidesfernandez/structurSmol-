package co.com.ies.smolplus.context.moduleusermanager.infrastructure.primary.mapper;


import org.mapstruct.*;

import co.com.ies.smolplus.context.moduleusermanager.domain.useraccess.UserAccess;
import co.com.ies.smolplus.context.moduleusermanager.infrastructure.secondary.UserAccessEntity;
import co.com.ies.smolplus.technical.infrastructure.primary.mapper.EntityMapper;


@Mapper(componentModel = "spring")
public interface UserAccessEntityMapper extends EntityMapper<UserAccess, UserAccessEntity> {


}
    