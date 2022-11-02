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
import co.com.ies.smolplus.dto.moduledevicemanager.ManufacturerDTO;
import co.com.ies.smolplus.technical.infrastructure.primary.exception.BadRequestAlertException;
import co.com.ies.smolplus.technical.infrastructure.primary.exception.HeaderUtil;
import co.com.ies.smolplus.technical.infrastructure.primary.exception.ResponseUtil;

@RestController
@RequestMapping("/api")
public class ManufacturerResource {

    private final Logger log = LoggerFactory.getLogger(ManufacturerResource.class);

    private static final String ENTITY_NAME = "manufacturer";

    @Value("${jhipster.clientApp.name}")
    private String applicationName;

    private final DeviceManagerService deviceManagerService;

    public ManufacturerResource(DeviceManagerService deviceManagerService) {
        this.deviceManagerService = deviceManagerService;
    }

    @PostMapping("/manufacturers")
    public ResponseEntity<ManufacturerDTO> createManufacturer(@Valid @RequestBody ManufacturerDTO manufacturerDTO)
        throws URISyntaxException {
        log.debug("REST request to save Manufacturer : {}", manufacturerDTO);
        if (manufacturerDTO.getId() != null) {
            throw new BadRequestAlertException("A new manufacturer cannot already have an ID", ENTITY_NAME, "idexists");
        }
        ManufacturerDTO result = null; //deviceManagerService.save(manufacturerDTO);
        return ResponseEntity
            .created(new URI("/api/manufacturers/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(applicationName, true, ENTITY_NAME, result.getId().toString()))
            .body(result);
    }

    @PutMapping("/manufacturers/{id}")
    public ResponseEntity<ManufacturerDTO> updateManufacturer(
        @PathVariable(value = "id", required = false) final Long id,
        @Valid @RequestBody ManufacturerDTO manufacturerDTO) {
        log.debug("REST request to update Manufacturer : {}, {}", id, manufacturerDTO);
        if (manufacturerDTO.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, manufacturerDTO.getId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        ManufacturerDTO result = null; //deviceManagerService.update(manufacturerDTO);
        return ResponseEntity
            .ok()
            .headers(HeaderUtil.createEntityUpdateAlert(applicationName, true, ENTITY_NAME, manufacturerDTO.getId().toString()))
            .body(result);
    }

    @GetMapping("/manufacturers")
    public ResponseEntity<List<ManufacturerDTO>> getAllManufacturers() {
        log.debug("REST request to get Manufacturers");
        return null;
    }

    @GetMapping("/manufacturers/{id}")
    public ResponseEntity<ManufacturerDTO> getManufacturer(@PathVariable Long id) {
        log.debug("REST request to get Manufacturer : {}", id);
        Optional<ManufacturerDTO> manufacturerDTO = null; //deviceManagerService.findOne(id);
        return ResponseUtil.wrapOrNotFound(manufacturerDTO);
    }

    @DeleteMapping("/manufacturers/{id}")
    public ResponseEntity<Void> deleteManufacturer(@PathVariable Long id) {
        log.debug("REST request to delete Manufacturer : {}", id);
        //manufacturerService.delete(id);
        return ResponseEntity
            .noContent()
            .headers(HeaderUtil.createEntityDeletionAlert(applicationName, true, ENTITY_NAME, id.toString()))
            .build();
    }
}
