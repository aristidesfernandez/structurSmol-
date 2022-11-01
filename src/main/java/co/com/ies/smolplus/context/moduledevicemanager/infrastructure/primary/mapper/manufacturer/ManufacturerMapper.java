package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.primary.mapper.manufacturer;


import org.mapstruct.Mapper;

import co.com.ies.smolplus.context.moduledevicemanager.domain.manufacturer.Manufacturer;
import co.com.ies.smolplus.dto.moduledevicemanager.ManufacturerDTO;
import co.com.ies.smolplus.technical.infrastructure.primary.mapper.DomainMapper;


@Mapper(componentModel = "spring")
public interface ManufacturerMapper extends DomainMapper<ManufacturerDTO, Manufacturer> {
    
}
    