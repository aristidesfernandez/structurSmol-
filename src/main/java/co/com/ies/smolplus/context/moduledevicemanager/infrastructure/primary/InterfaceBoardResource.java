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
import co.com.ies.smolplus.dto.moduledevicemanager.InterfaceBoardDTO;
import co.com.ies.smolplus.technical.infrastructure.primary.exception.BadRequestAlertException;
import co.com.ies.smolplus.technical.infrastructure.primary.exception.HeaderUtil;
import co.com.ies.smolplus.technical.infrastructure.primary.exception.ResponseUtil;

@RestController
@RequestMapping("/api")
public class InterfaceBoardResource {

    private final Logger log = LoggerFactory.getLogger(InterfaceBoardResource.class);

    private static final String ENTITY_NAME = "interfaceBoard";

    @Value("${jhipster.clientApp.name}")
    private String applicationName;

    private final DeviceManagerService deviceManagerService;

    public InterfaceBoardResource(DeviceManagerService deviceManagerService) {
        this.deviceManagerService = deviceManagerService;
    }

    @PostMapping("/interface-boards")
    public ResponseEntity<InterfaceBoardDTO> createInterfaceBoard(@Valid @RequestBody InterfaceBoardDTO interfaceBoardDTO)
        throws URISyntaxException {
        log.debug("REST request to save InterfaceBoard : {}", interfaceBoardDTO);
        if (interfaceBoardDTO.getId() != null) {
            throw new BadRequestAlertException("A new interfaceBoard cannot already have an ID", ENTITY_NAME, "idexists");
        }
        InterfaceBoardDTO result = null; //deviceManagerService.save(interfaceBoardDTO);
        return ResponseEntity
            .created(new URI("/api/interface-boards/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(applicationName, true, ENTITY_NAME, result.getId().toString()))
            .body(result);
    }

    @PutMapping("/interface-boards/{id}")
    public ResponseEntity<InterfaceBoardDTO> updateInterfaceBoard(
        @PathVariable(value = "id", required = false) final Long id,
        @Valid @RequestBody InterfaceBoardDTO interfaceBoardDTO) {
        log.debug("REST request to update InterfaceBoard : {}, {}", id, interfaceBoardDTO);
        if (interfaceBoardDTO.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, interfaceBoardDTO.getId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        InterfaceBoardDTO result = null; //deviceManagerService.update(interfaceBoardDTO);
        return ResponseEntity
            .ok()
            .headers(HeaderUtil.createEntityUpdateAlert(applicationName, true, ENTITY_NAME, interfaceBoardDTO.getId().toString()))
            .body(result);
    }

    @GetMapping("/interface-boards")
    public ResponseEntity<List<InterfaceBoardDTO>> getAllInterfaceBoards() {
        log.debug("REST request to get InterfaceBoards");
        return null;
    }

    @GetMapping("/interface-boards/{id}")
    public ResponseEntity<InterfaceBoardDTO> getInterfaceBoard(@PathVariable Long id) {
        log.debug("REST request to get InterfaceBoard : {}", id);
        Optional<InterfaceBoardDTO> interfaceBoardDTO = null; //deviceManagerService.findOne(id);
        return ResponseUtil.wrapOrNotFound(interfaceBoardDTO);
    }

    @DeleteMapping("/interface-boards/{id}")
    public ResponseEntity<Void> deleteInterfaceBoard(@PathVariable Long id) {
        log.debug("REST request to delete InterfaceBoard : {}", id);
        //interfaceBoardService.delete(id);
        return ResponseEntity
            .noContent()
            .headers(HeaderUtil.createEntityDeletionAlert(applicationName, true, ENTITY_NAME, id.toString()))
            .build();
    }
}
