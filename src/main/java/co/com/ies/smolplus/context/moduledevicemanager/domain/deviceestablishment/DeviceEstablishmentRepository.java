package co.com.ies.smolplus.context.moduledevicemanager.domain.deviceestablishment;


import java.util.List;

public interface DeviceEstablishmentRepository {


    List<DeviceEstablishment> getDeviceEstablishmentByEstablishmentId(Long id);
}
