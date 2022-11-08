package co.com.ies.smolplus.context.moduledevicemanager.application.deviceestablishment;

import co.com.ies.smolplus.dto.moduledevicemanager.DeviceEstablishmentDTO;

import java.util.List;
import java.util.UUID;

public interface DeviceEstablishmentService {
  List<DeviceEstablishmentDTO> getDeviceEstablishmentByEstablishmentId(UUID id);
}
