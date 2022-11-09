package co.com.ies.smolplus.context.moduledevicemanager.application.deviceestablishment;

import co.com.ies.smolplus.dto.moduledevicemanager.DeviceEstablishmentDTO;

import java.util.List;

public interface DeviceEstablishmentService {
  List<DeviceEstablishmentDTO> getDeviceEstablishmentByEstablishmentId(Integer id);
}
