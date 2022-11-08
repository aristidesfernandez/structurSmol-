package co.com.ies.smolplus.context.moduleorchestrator.moduleestablishmentmanager.insfrastructure.secondary;

import co.com.ies.smolplus.context.moduleestablishmentmanager.application.EstablishmentManagerService;
import co.com.ies.smolplus.context.moduleeventmanager.application.EventManagerService;
import co.com.ies.smolplus.context.moduleorchestrator.moduleestablishmentmanager.domain.ForeingEstablishmentManager;
import co.com.ies.smolplus.dto.moduleestablishmentmanager.EstablishmentDTO;
import co.com.ies.smolplus.dto.moduleestablishmentmanager.OperatorDTO;
import co.com.ies.smolplus.dto.moduleeventmanager.CounterEventDTO;
import co.com.ies.smolplus.dto.moduleeventmanager.EventDeviceDTO;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.UUID;

public class ForeingEstablishmentManagerImpl implements ForeingEstablishmentManager {

  private EstablishmentManagerService establishmentManagerService;
  private EventManagerService eventManagerService;

  public ForeingEstablishmentManagerImpl(EstablishmentManagerService establishmentManagerService, EventManagerService eventManagerService) {
    this.establishmentManagerService = establishmentManagerService;
    this.eventManagerService = eventManagerService;
  }

  @Override
  public List<EventDeviceDTO> getEventDeviceByDate(ZonedDateTime liquidationDate) {
    return eventManagerService.getEventDeviceByDate(liquidationDate);
  }

  @Override
  public List<CounterEventDTO> getCounterEventByEventDeviceId(UUID id) {
    return eventManagerService.getCounterEventByEventDeviceId(id);
  }

  @Override
  public List<OperatorDTO> getOperators() {
    return establishmentManagerService.getOperators();
  }

  @Override
  public List<EstablishmentDTO> getEstablishmentByOperatorId(UUID id) {
    return establishmentManagerService.getEstablishmentByOperatorId(id);
  }
}
