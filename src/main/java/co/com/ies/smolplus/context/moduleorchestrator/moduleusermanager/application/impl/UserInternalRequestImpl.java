package co.com.ies.smolplus.context.moduleorchestrator.moduleusermanager.application.impl;

import co.com.ies.smolplus.context.moduleorchestrator.moduleusermanager.application.UserInternalRequest;
import co.com.ies.smolplus.context.moduleusermanager.application.UserManagerService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class UserInternalRequestImpl implements UserInternalRequest {

    private final UserManagerService userManagerService;

    public UserInternalRequestImpl(UserManagerService userManagerService) {
        this.userManagerService = userManagerService;
    }    
    
}
