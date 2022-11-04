package co.com.ies.smolplus.context.moduleeventmanager.application.counterevent;

import co.com.ies.smolplus.dto.moduleeventmanager.CounterEventDTO;

import java.util.List;
import java.util.UUID;

public interface CounterEventService {
  List<CounterEventDTO> getCounterEventByEventDeviceId(UUID id);

}
