package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.primary;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.ies.smolplus.context.moduledevicemanager.application.DeviceManagerService;
import co.com.ies.smolplus.dto.moduledevicemanager.CounterDeviceDTO;
import co.com.ies.smolplus.technical.infrastructure.primary.exception.BadRequestAlertException;
import co.com.ies.smolplus.technical.infrastructure.primary.exception.HeaderUtil;
import co.com.ies.smolplus.technical.infrastructure.primary.exception.ResponseUtil;

@RestController
@RequestMapping("/api")
public class CounterDeviceResource {

    private final Logger log = LoggerFactory.getLogger(CounterDeviceResource.class);

    private static final String ENTITY_NAME = "counterDevice";

    private String applicationName;

    private final DeviceManagerService deviceManagerService;

    public CounterDeviceResource(DeviceManagerService deviceManagerService) {
        this.deviceManagerService = deviceManagerService;
    }

    @PostMapping("/counter-devices")
    public ResponseEntity<CounterDeviceDTO> createCounterDevice(@Valid @RequestBody CounterDeviceDTO counterDeviceDTO)
        throws URISyntaxException {
        log.debug("REST request to save CounterDevice : {}", counterDeviceDTO);
        if (counterDeviceDTO.getId() != null) {
            throw new BadRequestAlertException("A new counterDevice cannot already have an ID", ENTITY_NAME, "idexists");
        }
        CounterDeviceDTO result = null; //deviceManagerService.save(counterDeviceDTO);
        return ResponseEntity
            .created(new URI("/api/counter-devices/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(applicationName, true, ENTITY_NAME, result.getId().toString()))
            .body(result);
    }

    @PutMapping("/counter-devices/{id}")
    public ResponseEntity<CounterDeviceDTO> updateCounterDevice(
        @PathVariable(value = "id", required = false) final UUID id,
        @Valid @RequestBody CounterDeviceDTO counterDeviceDTO) {
        log.debug("REST request to update CounterDevice : {}, {}", id, counterDeviceDTO);
        if (counterDeviceDTO.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, counterDeviceDTO.getId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        CounterDeviceDTO result = null; //deviceManagerService.update(counterDeviceDTO);
        return ResponseEntity
            .ok()
            .headers(HeaderUtil.createEntityUpdateAlert(applicationName, true, ENTITY_NAME, counterDeviceDTO.getId().toString()))
            .body(result);
    }

    @GetMapping("/counter-devices")
    public ResponseEntity<List<CounterDeviceDTO>> getAllCounterDevices() {
        log.debug("REST request to get CounterDevices");
        return null;
    }

    @GetMapping("/counter-devices/{id}")
    public ResponseEntity<CounterDeviceDTO> getCounterDevice(@PathVariable UUID id) {
        log.debug("REST request to get CounterDevice : {}", id);
        Optional<CounterDeviceDTO> counterDeviceDTO = null; //deviceManagerService.findOneCounterDevice(id);
        return ResponseUtil.wrapOrNotFound(counterDeviceDTO);
    }

    @DeleteMapping("/counter-devices/{id}")
    public ResponseEntity<Void> deleteCounterDevice(@PathVariable UUID id) {
        log.debug("REST request to delete CounterDevice : {}", id);
        //counterDeviceService.delete(id);
        return ResponseEntity
            .noContent()
            .headers(HeaderUtil.createEntityDeletionAlert(applicationName, true, ENTITY_NAME, id.toString()))
            .build();
    }
}

