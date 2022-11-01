package co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.primary.mapper.province;

import co.com.ies.smolplus.context.moduleestablishmentmanager.domain.province.Province;
import co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.secundary.province.ProvinceEntity;
import co.com.ies.smolplus.technical.infrastructure.primary.mapper.EntityMapper;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface ProvinceEntityMapper extends EntityMapper<Province, ProvinceEntity> {}
