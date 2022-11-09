package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.secondary.deviceestablishment;

import co.com.ies.smolplus.context.moduledevicemanager.domain.deviceestablishment.DeviceEstablishment;
import co.com.ies.smolplus.context.moduledevicemanager.infrastructure.primary.mapper.deviceestablishment.DeviceEstablishmentEntityMapper;
import org.springframework.stereotype.Repository;
import co.com.ies.smolplus.context.moduledevicemanager.domain.deviceestablishment.DeviceEstablishmentRepository;

import java.util.List;


@Repository
public class SpringDataDeviceEstablishmentRepository implements DeviceEstablishmentRepository {

  private final JpaDeviceEstablishmentRepository jpaDeviceEstablishmentRepository;

  private final DeviceEstablishmentEntityMapper deviceEstablishmentEntityMapper;

  public SpringDataDeviceEstablishmentRepository(JpaDeviceEstablishmentRepository jpaDeviceEstablishmentRepository, DeviceEstablishmentEntityMapper deviceEstablishmentEntityMapper) {
    this.jpaDeviceEstablishmentRepository = jpaDeviceEstablishmentRepository;
    this.deviceEstablishmentEntityMapper = deviceEstablishmentEntityMapper;
  }

  @Override
  public List<DeviceEstablishment> getDeviceEstablishmentByEstablishmentId(Long id) {
    List<DeviceEstablishmentEntity> deviceEstablishmentEntityList = jpaDeviceEstablishmentRepository.findAllByEstablishmentId(id);
    List<DeviceEstablishment> deviceEstablishmentList = deviceEstablishmentEntityMapper.toDomain(deviceEstablishmentEntityList);
    return deviceEstablishmentList;
  }
}
