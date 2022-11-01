package co.com.ies.smolplus.context.moduleeventmanager.application;

import co.com.ies.smolplus.dto.moduleeventmanager.CounterEventDTO;

public interface EventManagerService {

    void create(CounterEventDTO request);
}
