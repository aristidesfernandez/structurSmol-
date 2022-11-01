package co.com.ies.smolplus.context.moduleeventmanager.application.impl;

import java.util.Optional;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.ies.smolplus.context.moduleeventmanager.application.EventManagerService;
import co.com.ies.smolplus.dto.moduleeventmanager.CounterEventDTO;
import co.com.ies.smolplus.dto.moduleeventmanager.EventDeviceDTO;
import co.com.ies.smolplus.dto.moduleeventmanager.EventTypeDTO;
import co.com.ies.smolplus.dto.moduleeventmanager.EventTypeModelDTO;

@Service
@Transactional
public class EventManagerServiceImpl implements EventManagerService {

    @Override
    public CounterEventDTO save(@Valid CounterEventDTO counterEventDTO) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public CounterEventDTO update(@Valid CounterEventDTO counterEventDTO) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Optional<CounterEventDTO> findOneCounterEventDTO(UUID id) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }

    @Override
    public void delete(UUID id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public EventDeviceDTO save(@Valid EventDeviceDTO eventDeviceDTO) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public EventDeviceDTO update(@Valid EventDeviceDTO eventDeviceDTO) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Optional<EventDeviceDTO> findOneEventDeviceDTO(UUID id) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }

    @Override
    public EventTypeModelDTO save(@Valid EventTypeModelDTO eventTypeModelDTO) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public EventTypeModelDTO update(@Valid EventTypeModelDTO eventTypeModelDTO) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Optional<EventTypeModelDTO> findOneEventTypeModelDTO(Long id) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }

    @Override
    public EventTypeDTO save(@Valid EventTypeDTO eventTypeDTO) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public EventTypeDTO update(@Valid EventTypeDTO eventTypeDTO) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Optional<EventTypeDTO> findOneEventEventTypeDTO(Long id) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }

    

}
