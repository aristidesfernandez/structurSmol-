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
import co.com.ies.smolplus.dto.moduledevicemanager.CommandModelDTO;
import co.com.ies.smolplus.technical.infrastructure.primary.exception.BadRequestAlertException;
import co.com.ies.smolplus.technical.infrastructure.primary.exception.HeaderUtil;
import co.com.ies.smolplus.technical.infrastructure.primary.exception.ResponseUtil;

@RestController
@RequestMapping("/api")
public class CommandModelResource {

    private final Logger log = LoggerFactory.getLogger(CommandModelResource.class);

    private static final String ENTITY_NAME = "commandModel";

    private String applicationName;

    private final DeviceManagerService deviceManagerService;

    public CommandModelResource(DeviceManagerService deviceManagerService) {
        this.deviceManagerService = deviceManagerService;
    }

    @PostMapping("/command-models")
    public ResponseEntity<CommandModelDTO> createCommandModel(@Valid @RequestBody CommandModelDTO commandModelDTO)
        throws URISyntaxException {
        log.debug("REST request to save CommandModel : {}", commandModelDTO);
        if (commandModelDTO.getId() != null) {
            throw new BadRequestAlertException("A new commandModel cannot already have an ID", ENTITY_NAME, "idexists");
        }
        CommandModelDTO result = null; //deviceManagerService.save(commandModelDTO);
        return ResponseEntity
            .created(new URI("/api/command-models/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(applicationName, true, ENTITY_NAME, result.getId().toString()))
            .body(result);
    }

    @PutMapping("/command-models/{id}")
    public ResponseEntity<CommandModelDTO> updateCommandModel(
        @PathVariable(value = "id", required = false) final Long id,
        @Valid @RequestBody CommandModelDTO commandModelDTO) {
        log.debug("REST request to update CommandModel : {}, {}", id, commandModelDTO);
        if (commandModelDTO.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, commandModelDTO.getId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }
        
        CommandModelDTO result = null; //deviceManagerService.update(commandModelDTO);
        return ResponseEntity
            .ok()
            .headers(HeaderUtil.createEntityUpdateAlert(applicationName, true, ENTITY_NAME, commandModelDTO.getId().toString()))
            .body(result);
    }

    @GetMapping("/command-models")
    public ResponseEntity<List<CommandModelDTO>> getAllCommandModels() {
        log.debug("REST request to get CommandModels");
        return null;
    }

    @GetMapping("/command-models/{id}")
    public ResponseEntity<CommandModelDTO> getCommandModel(@PathVariable Long id) {
        log.debug("REST request to get CommandModel : {}", id);
        Optional<CommandModelDTO> commandModelDTO = null; //deviceManagerService.findOneCommandModel(id);
        return ResponseUtil.wrapOrNotFound(commandModelDTO);
    }

    @DeleteMapping("/command-models/{id}")
    public ResponseEntity<Void> deleteCommandModel(@PathVariable Long id) {
        log.debug("REST request to delete CommandModel : {}", id);
        //commandModelService.delete(id);
        return ResponseEntity
            .noContent()
            .headers(HeaderUtil.createEntityDeletionAlert(applicationName, true, ENTITY_NAME, id.toString()))
            .build();
    }
}

