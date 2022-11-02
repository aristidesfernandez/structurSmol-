package co.com.ies.smolplus.context.moduleeventmanager.insfrastructure.primary;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.ies.smolplus.context.moduleeventmanager.application.EventManagerService;
import co.com.ies.smolplus.dto.moduleeventmanager.CounterEventDTO;

@RestController
@RequestMapping("/api")
public class CounterEventResource {

  private final Logger log = LoggerFactory.getLogger(CounterEventResource.class);

  private final EventManagerService eventManagerService;

  private String applicationName;

  private static final String ENTITY_NAME = "counterEvent";

  public CounterEventResource(EventManagerService eventManagerService) {
    this.eventManagerService = eventManagerService;
  }  

  @PostMapping("/counter-events")
  public ResponseEntity<CounterEventDTO> createCounterEvent(@Valid @RequestBody CounterEventDTO counterEventDTO)
      throws URISyntaxException {
    log.debug("REST request to save CounterEvent : {}", counterEventDTO);
    if (counterEventDTO.getId() != null) {
      throw new BadRequestAlertException("A new counterEvent cannot already have an ID", ENTITY_NAME, "idexists");
    }
    //CounterEventDTO result = eventManagerService.save(counterEventDTO);
    return ResponseEntity
        .created(new URI("/api/counter-events/" + 1L))
        .headers(HeaderUtil.createEntityCreationAlert(applicationName, true, ENTITY_NAME, "result.getId().toString()"))
        .body(null);
  }

  @PutMapping("/counter-events/{id}")
  public ResponseEntity<CounterEventDTO> updateCounterEvent(
      @PathVariable(value = "id", required = false) final UUID id,
      @Valid @RequestBody CounterEventDTO counterEventDTO) throws URISyntaxException {
    log.debug("REST request to update CounterEvent : {}, {}", id, counterEventDTO);
    if (counterEventDTO.getId() == null) {
      throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
    }
    if (!Objects.equals(id, counterEventDTO.getId())) {
      throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
    }

    //CounterEventDTO result = eventManagerService.update(counterEventDTO);
    return ResponseEntity
        .ok()
        .headers(
            HeaderUtil.createEntityUpdateAlert(applicationName, true, ENTITY_NAME, counterEventDTO.getId().toString()))
        .body(null);
  }

  @GetMapping("/counter-events")
  public ResponseEntity<List<CounterEventDTO>> getAllCounterEvents() {
    return null;
  }

  @GetMapping("/counter-events/{id}")
  public ResponseEntity<CounterEventDTO> getCounterEvent(@PathVariable UUID id) {
    log.debug("REST request to get CounterEvent : {}", id);
    //Optional<CounterEventDTO> counterEventDTO = eventManagerService.findOneCounterEventDTO(id);
    return ResponseUtil.wrapOrNotFound(null);
  }

  @DeleteMapping("/counter-events/{id}")
  public ResponseEntity<Void> deleteCounterEvent(@PathVariable UUID id) {
    log.debug("REST request to delete CounterEvent : {}", id);
    //eventManagerService.delete(id);
    return ResponseEntity
        .noContent()
        .headers(HeaderUtil.createEntityDeletionAlert(applicationName, true, ENTITY_NAME, id.toString()))
        .build();
  }
}
