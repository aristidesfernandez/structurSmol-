package co.com.ies.smolplus.context.moduledevicemanager.application.deviceestablishment.impl;

import co.com.ies.smolplus.context.moduledevicemanager.application.deviceestablishment.DeviceEstablishmentService;
import co.com.ies.smolplus.context.moduledevicemanager.domain.deviceestablishment.DeviceEstablishment;
import co.com.ies.smolplus.context.moduledevicemanager.domain.deviceestablishment.DeviceEstablishmentRepository;
import co.com.ies.smolplus.context.moduledevicemanager.infrastructure.primary.mapper.deviceestablishment.DeviceEstablishmentMapper;
import co.com.ies.smolplus.dto.moduledevicemanager.DeviceEstablishmentDTO;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class DeviceEstablishmentServiceImpl implements DeviceEstablishmentService {

  private DeviceEstablishmentRepository deviceEstablishmentRepository;

  private DeviceEstablishmentMapper deviceEstablishmentMapper;

  public DeviceEstablishmentServiceImpl(DeviceEstablishmentRepository deviceEstablishmentRepository, DeviceEstablishmentMapper deviceEstablishmentMapper) {
    this.deviceEstablishmentRepository = deviceEstablishmentRepository;
    this.deviceEstablishmentMapper = deviceEstablishmentMapper;
  }

  @Override
  public List<DeviceEstablishmentDTO> getDeviceEstablishmentByEstablishmentId(Long id) {
    List<DeviceEstablishment> deviceEstablishmentList = deviceEstablishmentRepository.getDeviceEstablishmentByEstablishmentId(id);
    List<DeviceEstablishmentDTO> deviceEstablishmentDTOList = deviceEstablishmentMapper.toDto(deviceEstablishmentList);
    return deviceEstablishmentDTOList;
  }
}
