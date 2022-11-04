package co.com.ies.smolplus.context.moduleeventmanager.application.eventdevice.impl;

import co.com.ies.smolplus.context.moduleeventmanager.domain.counterevent.CounterEvent;
import co.com.ies.smolplus.context.moduleeventmanager.domain.eventdevice.EventDevice;
import co.com.ies.smolplus.context.moduleeventmanager.domain.eventdevice.EventDeviceRepository;
import co.com.ies.smolplus.context.moduleeventmanager.insfrastructure.primary.mapper.eventdevice.EventDeviceMapper;
import co.com.ies.smolplus.dto.moduleeventmanager.CounterEventDTO;
import co.com.ies.smolplus.dto.moduleeventmanager.EventDeviceDTO;
import org.springframework.stereotype.Service;

import co.com.ies.smolplus.context.moduleeventmanager.application.eventdevice.EventDeviceService;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class EventDeviceServiceImpl implements EventDeviceService {

  private EventDeviceRepository eventDeviceRepository;

  private EventDeviceMapper eventDeviceMapper;

  public EventDeviceServiceImpl(EventDeviceRepository eventDeviceRepository, EventDeviceMapper eventDeviceMapper) {
    this.eventDeviceRepository = eventDeviceRepository;
    this.eventDeviceMapper = eventDeviceMapper;
  }

  @Override
  public List<EventDeviceDTO> getEventDeviceByDate(ZonedDateTime liquidationDate) {
    List<EventDevice> resultEventDevice = eventDeviceRepository.getEventDeviceByDate(liquidationDate);
    List<EventDeviceDTO> eventDevice = eventDeviceMapper.toDto(resultEventDevice);
    return eventDevice;
  }

}
