package co.com.ies.smolplus.context.moduleeventmanager.insfrastructure.primary;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import co.com.ies.smolplus.technical.infrastructure.primary.exception.HeaderUtil;
import co.com.ies.smolplus.technical.infrastructure.primary.exception.ResponseUtil;
import javax.validation.Valid;
import co.com.ies.smolplus.technical.infrastructure.primary.exception.BadRequestAlertException;

import co.com.ies.smolplus.context.moduleeventmanager.application.EventManagerService;
import co.com.ies.smolplus.dto.moduleeventmanager.EventDeviceDTO;

@RestController
@RequestMapping("/api")
public class EventDeviceResource {

  private final Logger log = LoggerFactory.getLogger(EventDeviceResource.class);

  private final EventManagerService eventManagerService;

  private String applicationName;

  private static final String ENTITY_NAME = "EventDevice";

  public EventDeviceResource(EventManagerService eventManagerService) {
    this.eventManagerService = eventManagerService;
  }  

  @PostMapping("/events-device")
  public ResponseEntity<EventDeviceDTO> createEventDevice(@Valid @RequestBody EventDeviceDTO EventDeviceDTO)
      throws URISyntaxException {
    log.debug("REST request to save EventDevice : {}", EventDeviceDTO);
    if (EventDeviceDTO.getId() != null) {
      throw new BadRequestAlertException("A new EventDevice cannot already have an ID", ENTITY_NAME, "idexists");
    }
    //EventDeviceDTO result = eventManagerService.save(EventDeviceDTO);
    return ResponseEntity
        .created(new URI("/api/events-device/" + 1L))
        .headers(HeaderUtil.createEntityCreationAlert(applicationName, true, ENTITY_NAME, "result.getId().toString()"))
        .body(null);
  }

  @PutMapping("/events-device/{id}")
  public ResponseEntity<EventDeviceDTO> updateEventDevice(
      @PathVariable(value = "id", required = false) final UUID id,
      @Valid @RequestBody EventDeviceDTO eventDeviceDTO) throws URISyntaxException {
    log.debug("REST request to update EventDevice : {}, {}", id, eventDeviceDTO);
    if (eventDeviceDTO.getId() == null) {
      throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
    }
    if (!Objects.equals(id, eventDeviceDTO.getId())) {
      throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
    }

    //EventDeviceDTO result = eventManagerService.update(eventDeviceDTO);
    return ResponseEntity
        .ok()
        .headers(
            HeaderUtil.createEntityUpdateAlert(applicationName, true, ENTITY_NAME, eventDeviceDTO.getId().toString()))
        .body(null);
  }

  @GetMapping("/events-device")
  public ResponseEntity<List<EventDeviceDTO>> getAllEventDevices() {
    return null;
  }

  @GetMapping("/events-device/{id}")
  public ResponseEntity<EventDeviceDTO> getEventDevice(@PathVariable UUID id) {
    log.debug("REST request to get EventDevice : {}", id);
    //Optional<EventDeviceDTO> eventDeviceDTO = eventManagerService.findOneEventDeviceDTO(id);
    return ResponseUtil.wrapOrNotFound(null);
  }

  @DeleteMapping("/events-device/{id}")
  public ResponseEntity<Void> deleteEventDevice(@PathVariable UUID id) {
    log.debug("REST request to delete EventDevice : {}", id);
    //eventManagerService.delete(id);
    return ResponseEntity
        .noContent()
        .headers(HeaderUtil.createEntityDeletionAlert(applicationName, true, ENTITY_NAME, id.toString()))
        .build();
  }
}
