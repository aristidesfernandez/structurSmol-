package co.com.ies.smolplus.context.moduledevicemanager.application;

import co.com.ies.smolplus.dto.moduledevicemanager.DeviceEstablishmentDTO;

import java.util.List;
import java.util.UUID;

public interface DeviceManagerService {

    List<DeviceEstablishmentDTO> getDeviceEstablishmentByEstablishmentId(UUID id);
}
