package co.com.ies.smolplus.context.moduledevicemanager.application;

import co.com.ies.smolplus.dto.moduledevicemanager.DeviceEstablishmentDTO;

import java.util.List;

public interface DeviceManagerService {

    List<DeviceEstablishmentDTO> getDeviceEstablishmentByEstablishmentId(Long id);
}
