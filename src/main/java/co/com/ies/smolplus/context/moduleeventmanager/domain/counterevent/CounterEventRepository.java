package co.com.ies.smolplus.context.moduleeventmanager.domain.counterevent;

import co.com.ies.smolplus.dto.moduleeventmanager.CounterEventDTO;

import java.util.List;
import java.util.UUID;

public interface CounterEventRepository {
  List<CounterEvent> getCounterEventByEventDeviceId(UUID id);


}
