package co.com.ies.smolplus.context.moduleeventmanager.application.counterevent.impl;

import co.com.ies.smolplus.context.moduleeventmanager.domain.counterevent.CounterEvent;
import co.com.ies.smolplus.context.moduleeventmanager.domain.counterevent.CounterEventRepository;
import co.com.ies.smolplus.context.moduleeventmanager.insfrastructure.primary.mapper.counterevent.CounterEventMapper;
import co.com.ies.smolplus.dto.moduleeventmanager.CounterEventDTO;
import org.springframework.stereotype.Service;

import co.com.ies.smolplus.context.moduleeventmanager.application.counterevent.CounterEventService;

import java.util.List;
import java.util.UUID;

@Service
public class CounterEventServiceImpl implements CounterEventService {

  private CounterEventRepository counterEventRepository;

  private CounterEventMapper counterEventMapper;

  public CounterEventServiceImpl(CounterEventRepository counterEventRepository, CounterEventMapper counterEventMapper) {
    this.counterEventRepository = counterEventRepository;
    this.counterEventMapper = counterEventMapper;
  }

  @Override
  public List<CounterEventDTO> getCounterEventByEventDeviceId(UUID id) {
    List<CounterEvent> counterEventList = counterEventRepository.getCounterEventByEventDeviceId(id);
    List<CounterEventDTO> counterEventDTOList = counterEventMapper.toDto(counterEventList);
    return counterEventDTOList;
  }
}
