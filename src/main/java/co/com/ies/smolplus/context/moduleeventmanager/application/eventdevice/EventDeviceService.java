package co.com.ies.smolplus.context.moduleeventmanager.application.eventdevice;

import co.com.ies.smolplus.dto.moduleeventmanager.CounterEventDTO;
import co.com.ies.smolplus.dto.moduleeventmanager.EventDeviceDTO;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.UUID;


public interface EventDeviceService {

  List<EventDeviceDTO> getEventDeviceByDate(ZonedDateTime liquidationDate);

}
