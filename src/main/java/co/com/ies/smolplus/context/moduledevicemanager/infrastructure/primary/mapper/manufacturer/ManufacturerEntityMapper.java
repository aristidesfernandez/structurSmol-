package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.primary.mapper.manufacturer;


import org.mapstruct.Mapper;

import co.com.ies.smolplus.context.moduledevicemanager.domain.manufacturer.Manufacturer;
import co.com.ies.smolplus.context.moduledevicemanager.infrastructure.secondary.manufacturer.ManufacturerEntity;
import co.com.ies.smolplus.technical.infrastructure.primary.mapper.EntityMapper;


@Mapper(componentModel = "spring")
public interface ManufacturerEntityMapper extends EntityMapper<Manufacturer, ManufacturerEntity> {


}
    