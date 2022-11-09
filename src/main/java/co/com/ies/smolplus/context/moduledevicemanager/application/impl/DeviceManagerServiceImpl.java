package co.com.ies.smolplus.context.moduledevicemanager.application.impl;

import co.com.ies.smolplus.context.moduledevicemanager.application.deviceestablishment.DeviceEstablishmentService;
import co.com.ies.smolplus.dto.moduledevicemanager.DeviceEstablishmentDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.ies.smolplus.context.moduledevicemanager.application.DeviceManagerService;

import java.util.List;

@Service
@Transactional
public class DeviceManagerServiceImpl implements DeviceManagerService {

  private DeviceEstablishmentService deviceEstablishmentService;

  @Override
  public List<DeviceEstablishmentDTO> getDeviceEstablishmentByEstablishmentId(Integer id) {
    return deviceEstablishmentService.getDeviceEstablishmentByEstablishmentId(id);
  }
}
