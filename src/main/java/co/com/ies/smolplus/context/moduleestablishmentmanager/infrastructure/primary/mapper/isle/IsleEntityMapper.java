package co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.primary.mapper.isle;



import co.com.ies.smolplus.context.moduleestablishmentmanager.domain.isle.Isle;
import co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.secundary.isle.IsleEntity;
import co.com.ies.smolplus.technical.infrastructure.primary.mapper.EntityMapper;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface IsleEntityMapper extends EntityMapper<Isle, IsleEntity> {}
