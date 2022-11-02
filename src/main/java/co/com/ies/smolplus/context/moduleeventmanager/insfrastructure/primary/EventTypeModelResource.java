package co.com.ies.smolplus.context.moduleeventmanager.insfrastructure.primary;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.ies.smolplus.context.moduleeventmanager.application.EventManagerService;
import co.com.ies.smolplus.dto.moduleeventmanager.EventTypeModelDTO;

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
public class EventTypeModelResource {

  private final Logger log = LoggerFactory.getLogger(EventTypeModelResource.class);

  private final EventManagerService eventManagerService;

  private String applicationName;

  private static final String ENTITY_NAME = "EventTypeModel";

  public EventTypeModelResource(EventManagerService eventManagerService) {
    this.eventManagerService = eventManagerService;
  }

  @PostMapping("/events-type-model")
  public ResponseEntity<EventTypeModelDTO> createEventTypeModel(@Valid @RequestBody EventTypeModelDTO eventTypeModelDTO)
      throws URISyntaxException {
    log.debug("REST request to save EventTypeModel: {}", eventTypeModelDTO);
    if (eventTypeModelDTO.getId() != null) {
      throw new BadRequestAlertException("A new EventTypeModel cannot already have an ID", ENTITY_NAME, "idexists");
    }
    //EventTypeModelDTO result = eventManagerService.save(eventTypeModelDTO);
    return ResponseEntity
        .created(new URI("/api/events-type-model/" + 1L))
        .headers(HeaderUtil.createEntityCreationAlert(applicationName, true, ENTITY_NAME, "result.getId().toString()"))
        .body(null);
  }

  @PutMapping("/events-type-model/{id}")
  public ResponseEntity<EventTypeModelDTO> updateEventTypeModel(
      @PathVariable(value = "id", required = false) final Long id,
      @Valid @RequestBody EventTypeModelDTO eventTypeModelDTO) throws URISyntaxException {
    log.debug("REST request to update EventTypeModel : {}, {}", id, eventTypeModelDTO);
    if (eventTypeModelDTO.getId() == null) {
      throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
    }
    if (!Objects.equals(id, eventTypeModelDTO.getId())) {
      throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
    }

    //EventTypeModelDTO result = eventManagerService.update(eventTypeModelDTO);
    return ResponseEntity
        .ok()
        .headers(
            HeaderUtil.createEntityUpdateAlert(applicationName, true, ENTITY_NAME, eventTypeModelDTO.getId().toString()))
        .body(null);
  }

  @GetMapping("/events-type-model")
  public ResponseEntity<List<EventTypeModelDTO>> getAllEventTypeModels() {
    return null;
  }

  @GetMapping("/events-type-model/{id}")
  public ResponseEntity<EventTypeModelDTO> getEventTypeModel(@PathVariable Long id) {
    log.debug("REST request to get EventTypeModel : {}", id);
    //Optional<EventTypeModelDTO> eventTypeModelDTO = eventManagerService.findOneEventTypeModelDTO(id);
    return ResponseUtil.wrapOrNotFound(null);
  }

  @DeleteMapping("/events-type-model/{id}")
  public ResponseEntity<Void> deleteEventTypeModel(@PathVariable Long id) {
    log.debug("REST request to delete EventTypeModel : {}", id);
    //eventManagerService.delete(id);
    return ResponseEntity
        .noContent()
        .headers(HeaderUtil.createEntityDeletionAlert(applicationName, true, ENTITY_NAME, id.toString()))
        .build();
  }
}
