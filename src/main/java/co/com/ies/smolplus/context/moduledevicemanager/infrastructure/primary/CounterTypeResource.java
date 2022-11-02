package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.primary;


import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

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
import co.com.ies.smolplus.dto.moduledevicemanager.CounterTypeDTO;
import co.com.ies.smolplus.technical.infrastructure.primary.exception.BadRequestAlertException;
import co.com.ies.smolplus.technical.infrastructure.primary.exception.HeaderUtil;
import co.com.ies.smolplus.technical.infrastructure.primary.exception.ResponseUtil;

@RestController
@RequestMapping("/api")
public class CounterTypeResource {

    private final Logger log = LoggerFactory.getLogger(CounterTypeResource.class);

    private static final String ENTITY_NAME = "counterType";

    private String applicationName;

    private final DeviceManagerService deviceManagerService;

    public CounterTypeResource(DeviceManagerService deviceManagerService) {
        this.deviceManagerService = deviceManagerService;
    }

    @PostMapping("/counter-types")
    public ResponseEntity<CounterTypeDTO> createCounterType(@Valid @RequestBody CounterTypeDTO counterTypeDTO) throws URISyntaxException {
        log.debug("REST request to save CounterType : {}", counterTypeDTO);
        if (counterTypeDTO.getCounterCode() != null) {
            throw new BadRequestAlertException("A new counterType cannot already have an ID", ENTITY_NAME, "idexists");
        }
        CounterTypeDTO result = null; //deviceManagerService.save(counterTypeDTO);
        return ResponseEntity
            .created(new URI("/api/counter-types/" + result.getCounterCode()))
            .headers(HeaderUtil.createEntityCreationAlert(applicationName, true, ENTITY_NAME, result.getCounterCode()))
            .body(result);
    }

    @PutMapping("/counter-types/{counterCode}")
    public ResponseEntity<CounterTypeDTO> updateCounterType(
        @PathVariable(value = "counterCode", required = false) final String counterCode,
        @Valid @RequestBody CounterTypeDTO counterTypeDTO) {
        log.debug("REST request to update CounterType : {}, {}", counterCode, counterTypeDTO);
        if (counterTypeDTO.getCounterCode() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(counterCode, counterTypeDTO.getCounterCode())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        CounterTypeDTO result = null; //deviceManagerService.update(counterTypeDTO);
        return ResponseEntity
            .ok()
            .headers(HeaderUtil.createEntityUpdateAlert(applicationName, true, ENTITY_NAME, counterTypeDTO.getCounterCode()))
            .body(result);
    }

    @GetMapping("/counter-types")
    public ResponseEntity<List<CounterTypeDTO>> getAllCounterTypes() {
        log.debug("REST request to get CounterTypes");
        return null;
    }

    @GetMapping("/counter-types/{id}")
    public ResponseEntity<CounterTypeDTO> getCounterType(@PathVariable String id) {
        log.debug("REST request to get CounterType : {}", id);
        Optional<CounterTypeDTO> counterTypeDTO = null; //deviceManagerService.findOneCounterType(id);
        return ResponseUtil.wrapOrNotFound(counterTypeDTO);
    }

    @DeleteMapping("/counter-types/{id}")
    public ResponseEntity<Void> deleteCounterType(@PathVariable String id) {
        log.debug("REST request to delete CounterType : {}", id);
        //counterTypeService.delete(id);
        return ResponseEntity.noContent().headers(HeaderUtil.createEntityDeletionAlert(applicationName, true, ENTITY_NAME, id)).build();
    }
}

