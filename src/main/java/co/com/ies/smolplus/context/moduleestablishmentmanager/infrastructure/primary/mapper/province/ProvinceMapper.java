package co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.primary.mapper.province;

import co.com.ies.smolplus.context.moduleestablishmentmanager.domain.province.Province;
import co.com.ies.smolplus.dto.ProvinceDTO;
import co.com.ies.smolplus.technical.infrastructure.primary.mapper.DomainMapper;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface ProvinceMapper extends DomainMapper<ProvinceDTO, Province> {}
