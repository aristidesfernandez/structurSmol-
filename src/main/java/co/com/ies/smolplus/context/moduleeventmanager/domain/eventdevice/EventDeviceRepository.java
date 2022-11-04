package co.com.ies.smolplus.context.moduleeventmanager.domain.eventdevice;

import co.com.ies.smolplus.context.moduleeventmanager.domain.counterevent.CounterEvent;
import co.com.ies.smolplus.dto.moduleeventmanager.CounterEventDTO;
import co.com.ies.smolplus.dto.moduleeventmanager.EventDeviceDTO;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.UUID;

public interface EventDeviceRepository {

  List<EventDevice> getEventDeviceByDate(ZonedDateTime liquidationDate);

}
