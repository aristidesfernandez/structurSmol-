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
import co.com.ies.smolplus.dto.moduledevicemanager.CommandDeviceDTO;
import co.com.ies.smolplus.technical.infrastructure.primary.exception.BadRequestAlertException;
import co.com.ies.smolplus.technical.infrastructure.primary.exception.HeaderUtil;
import co.com.ies.smolplus.technical.infrastructure.primary.exception.ResponseUtil;

@RestController
@RequestMapping("/api")
public class CommandDeviceResource {

    private final Logger log = LoggerFactory.getLogger(CommandDeviceResource.class);

    private static final String ENTITY_NAME = "commandDevice";

    @Value("${jhipster.clientApp.name}")
    private String applicationName;

    private final DeviceManagerService deviceManagerService;

    public CommandDeviceResource(DeviceManagerService deviceManagerService) {
        this.deviceManagerService = deviceManagerService;
    }

    @PostMapping("/command-devices")
    public ResponseEntity<CommandDeviceDTO> createCommandDevice(@Valid @RequestBody CommandDeviceDTO commandDeviceDTO)
        throws URISyntaxException {
        log.debug("REST request to save CommandDevice : {}", commandDeviceDTO);
        if (commandDeviceDTO.getId() != null) {
            throw new BadRequestAlertException("A new commandDevice cannot already have an ID", ENTITY_NAME, "idexists");
        }
        CommandDeviceDTO result = null; //deviceManagerService.save(commandDeviceDTO);
        return ResponseEntity
            .created(new URI("/api/command-devices/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(applicationName, true, ENTITY_NAME, result.getId().toString()))
            .body(result);
    }

    @PutMapping("/command-devices/{id}")
    public ResponseEntity<CommandDeviceDTO> updateCommandDevice(
        @PathVariable(value = "id", required = false) final Long id,
        @Valid @RequestBody CommandDeviceDTO commandDeviceDTO) {
        log.debug("REST request to update CommandDevice : {}, {}", id, commandDeviceDTO);
        if (commandDeviceDTO.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, commandDeviceDTO.getId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        CommandDeviceDTO result = null; //deviceManagerService.update(commandDeviceDTO);
        return ResponseEntity
            .ok()
            .headers(HeaderUtil.createEntityUpdateAlert(applicationName, true, ENTITY_NAME, commandDeviceDTO.getId().toString()))
            .body(result);
    }
    
    @GetMapping("/command-devices")
    public ResponseEntity<List<CommandDeviceDTO>> getAllCommandDevices() {
        log.debug("REST request to get CommandDevices");
        return null;
    }

    @GetMapping("/command-devices/{id}")
    public ResponseEntity<CommandDeviceDTO> getCommandDevice(@PathVariable Long id) {
        log.debug("REST request to get CommandDevice : {}", id);
        Optional<CommandDeviceDTO> commandDeviceDTO = null; //deviceManagerService.findOneCommandDevice(id);
        return ResponseUtil.wrapOrNotFound(commandDeviceDTO);
    }

    @DeleteMapping("/command-devices/{id}")
    public ResponseEntity<Void> deleteCommandDevice(@PathVariable Long id) {
        log.debug("REST request to delete CommandDevice : {}", id);
        //deviceManagerService.delete(id);
        return ResponseEntity
            .noContent()
            .headers(HeaderUtil.createEntityDeletionAlert(applicationName, true, ENTITY_NAME, id.toString()))
            .build();
    }
}
