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
import co.com.ies.smolplus.dto.moduledevicemanager.CommandDTO;
import co.com.ies.smolplus.technical.infrastructure.primary.exception.BadRequestAlertException;
import co.com.ies.smolplus.technical.infrastructure.primary.exception.HeaderUtil;
import co.com.ies.smolplus.technical.infrastructure.primary.exception.ResponseUtil;

@RestController
@RequestMapping("/api")
public class CommandResource {

    private final Logger log = LoggerFactory.getLogger(CommandResource.class);

    private static final String ENTITY_NAME = "command";

    @Value("${jhipster.clientApp.name}")
    private String applicationName;

    private final DeviceManagerService deviceManagerService;

    public CommandResource(DeviceManagerService deviceManagerService) {
        this.deviceManagerService = deviceManagerService;
    }

    @PostMapping("/commands")
    public ResponseEntity<CommandDTO> createCommand(@Valid @RequestBody CommandDTO commandDTO) throws URISyntaxException {
        log.debug("REST request to save Command : {}", commandDTO);
        if (commandDTO.getId() != null) {
            throw new BadRequestAlertException("A new command cannot already have an ID", ENTITY_NAME, "idexists");
        }
        CommandDTO result = null; //deviceManagerService.save(commandDTO);
        return ResponseEntity
            .created(new URI("/api/commands/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(applicationName, true, ENTITY_NAME, result.getId().toString()))
            .body(result);
    }

    @PutMapping("/commands/{id}")
    public ResponseEntity<CommandDTO> updateCommand(
        @PathVariable(value = "id", required = false) final Long id,
        @Valid @RequestBody CommandDTO commandDTO) {
        log.debug("REST request to update Command : {}, {}", id, commandDTO);
        if (commandDTO.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, commandDTO.getId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        CommandDTO result = null; //deviceManagerService.update(commandDTO);
        return ResponseEntity
            .ok()
            .headers(HeaderUtil.createEntityUpdateAlert(applicationName, true, ENTITY_NAME, commandDTO.getId().toString()))
            .body(result);
    }

    @GetMapping("/commands")
    public ResponseEntity<List<CommandDTO>> getAllCommands() {
        log.debug("REST request to get allCommands");
        return null;
    }

    @GetMapping("/commands/{id}")
    public ResponseEntity<CommandDTO> getCommand(@PathVariable Long id) {
        log.debug("REST request to get Command : {}", id);
        Optional<CommandDTO> commandDTO = null; //deviceManagerService.findOneCommand(id);
        return ResponseUtil.wrapOrNotFound(commandDTO);
    }

    @DeleteMapping("/commands/{id}")
    public ResponseEntity<Void> deleteCommand(@PathVariable Long id) {
        log.debug("REST request to delete Command : {}", id);
        //deviceManagerService.delete(id);
        return ResponseEntity
            .noContent()
            .headers(HeaderUtil.createEntityDeletionAlert(applicationName, true, ENTITY_NAME, id.toString()))
            .build();
    }
}
