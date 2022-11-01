package co.com.ies.smolplus.context.moduleeventmanager.application.impl;

import co.com.ies.smolplus.context.moduleeventmanager.application.EventManagerService;
import co.com.ies.smolplus.context.moduleeventmanager.domain.counterevent.CounterEvent;
import co.com.ies.smolplus.context.moduleeventmanager.insfrastructure.primary.mapper.counterevent.CounterEventMapper;
import co.com.ies.smolplus.dto.moduleeventmanager.CounterEventDTO;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EventManagerServiceImpl implements EventManagerService {


    private final CounterEventMapper mapper;

    public EventManagerServiceImpl(CounterEventMapper mapper){
        this.mapper = mapper;
    }





    @Override
    public void create(CounterEventDTO request) {  
        CounterEvent counterEvent =  mapper.toEntity(request); 
        // caso de uso de crear
        // createCounter(counterEvent);
        
    }


}
