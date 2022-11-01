package co.com.ies.smolplus.context.moduleeventmanager.insfrastructure.primary;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.ies.smolplus.context.moduleeventmanager.application.EventManagerService;
import co.com.ies.smolplus.dto.moduleeventmanager.EventTypeDTO;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

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

@RestController
@RequestMapping("/api")
public class EventTypeResource {

  private final Logger log = LoggerFactory.getLogger(EventTypeResource.class);

  private final EventManagerService eventManagerService;

  private String applicationName;

  private static final String ENTITY_NAME = "EventType";

  public EventTypeResource(EventManagerService eventManagerService) {
    this.eventManagerService = eventManagerService;
  }

  @PostMapping("/events-type")
  public ResponseEntity<EventTypeDTO> createEventType(@Valid @RequestBody EventTypeDTO eventTypeDTO)
      throws URISyntaxException {
    log.debug("REST request to save EventType : {}", eventTypeDTO);
    if (eventTypeDTO.getId() != null) {
      throw new BadRequestAlertException("A new EventType cannot already have an ID", ENTITY_NAME, "idexists");
    }
    EventTypeDTO result = eventManagerService.save(eventTypeDTO);
    return ResponseEntity
        .created(new URI("/api/events-type/" + result.getId()))
        .headers(HeaderUtil.createEntityCreationAlert(applicationName, true, ENTITY_NAME, result.getId().toString()))
        .body(result);
  }

  @PutMapping("/events-type/{id}")
  public ResponseEntity<EventTypeDTO> updateEventType(
      @PathVariable(value = "id", required = false) final Long id,
      @Valid @RequestBody EventTypeDTO eventTypeDTO) throws URISyntaxException {
    log.debug("REST request to update EventType : {}, {}", id, eventTypeDTO);
    if (eventTypeDTO.getId() == null) {
      throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
    }
    if (!Objects.equals(id, eventTypeDTO.getId())) {
      throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
    }

    EventTypeDTO result = eventManagerService.update(eventTypeDTO);
    return ResponseEntity
        .ok()
        .headers(
            HeaderUtil.createEntityUpdateAlert(applicationName, true, ENTITY_NAME, eventTypeDTO.getId().toString()))
        .body(result);
  }

  @GetMapping("/events-type")
  public ResponseEntity<List<EventTypeDTO>> getAllEventTypes() {
    return null;
  }

  @GetMapping("/events-type/{id}")
  public ResponseEntity<EventTypeDTO> getEventType(@PathVariable Long id) {
    log.debug("REST request to get EventType : {}", id);
    Optional<EventTypeDTO> eventTypeDTO = eventManagerService.findOneEventEventTypeDTO(id);
    return ResponseUtil.wrapOrNotFound(eventTypeDTO);
  }

  @DeleteMapping("/events-type/{id}")
  public ResponseEntity<Void> deleteEventType(@PathVariable Long id) {
    log.debug("REST request to delete EventType : {}", id);
    eventManagerService.delete(id);
    return ResponseEntity
        .noContent()
        .headers(HeaderUtil.createEntityDeletionAlert(applicationName, true, ENTITY_NAME, id.toString()))
        .build();
  }

}
