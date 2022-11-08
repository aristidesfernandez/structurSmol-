package co.com.ies.smolplus.context.moduledevicemanager.domain.deviceestablishment;


import java.util.List;
import java.util.UUID;

public interface DeviceEstablishmentRepository {


    List<DeviceEstablishment> getDeviceEstablishmentByEstablishmentId(UUID id);
}
