package co.com.ies.smolplus.context.moduleorchestrator.moduleeventmanager.insfrastructure.primary;

import co.com.ies.smolplus.context.moduleorchestrator.moduleeventmanager.application.EventManagerRequest;
import co.com.ies.smolplus.dto.moduleeventmanager.CounterEventDTO;
import co.com.ies.smolplus.dto.moduleeventmanager.EventDeviceDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api")
public class EventManagerResource {

  private final Logger log = LoggerFactory.getLogger(EventManagerResource.class);

  private final EventManagerRequest eventManagerRequest;

  public EventManagerResource(EventManagerRequest eventManagerRequest) {
    this.eventManagerRequest = eventManagerRequest;
  }

  @GetMapping("/event-manager/event-device")
  public ResponseEntity<List<EventDeviceDTO>> getEventDevice() {
    log.debug("REST request to GET EventDevice : {}");

    List<EventDeviceDTO> eventDeviceDTOList = eventManagerRequest.getEventDeviceByDate();
    log.debug("REST RESPONSE to GET EventDevice : {}", eventDeviceDTOList );
    System.out.println("REST RESPONSE to save EventDevice : {}"+ eventDeviceDTOList );

    //EventDeviceDTO result = even++tManagerService.save(EventDeviceDTO);
    return ResponseEntity.ok(eventDeviceDTOList);
  }

  @GetMapping("/event-manager/counter-event/{id}")
  public ResponseEntity<List<CounterEventDTO>> getCounterEventByEventDeviceId(@PathVariable("id") UUID id) {
    log.debug("REST request to GET CounterEvent : {}");

    List<CounterEventDTO> counterEventDTOList = eventManagerRequest.getCounterEventByEventDeviceId(id);
    log.debug("REST RESPONSE to save EventDevice : {}", counterEventDTOList );
    System.out.println("REST RESPONSE to GET CounterEvent : {}"+ counterEventDTOList );

    //EventDeviceDTO result = even++tManagerService.save(EventDeviceDTO);
    return ResponseEntity.ok(counterEventDTOList);
  }
}
