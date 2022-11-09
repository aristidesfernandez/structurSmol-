package co.com.ies.smolplus.context.moduleorchestrator.moduleestablishmentmanager.domain;

import co.com.ies.smolplus.dto.moduledevicemanager.DeviceEstablishmentDTO;
import co.com.ies.smolplus.dto.moduleestablishmentmanager.EstablishmentDTO;
import co.com.ies.smolplus.dto.moduleestablishmentmanager.OperatorDTO;
import co.com.ies.smolplus.dto.moduleeventmanager.CounterEventDTO;
import co.com.ies.smolplus.dto.moduleeventmanager.EventDeviceDTO;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.UUID;

public interface ForeingEstablishmentManager {

  List<EventDeviceDTO> getEventDeviceByDate(ZonedDateTime liquidationDate);

  List<CounterEventDTO> getCounterEventByEventDeviceId(UUID id);

  List<OperatorDTO> getOperators();

  List<EstablishmentDTO> getEstablishmentByOperatorId(Long id);

  List<DeviceEstablishmentDTO> getDeviceEstablishmentByEstablishmentId(Integer id);
}
