package co.com.ies.smolplus.context.moduleorchestrator.moduleusermanager.application.impl;

import co.com.ies.smolplus.context.moduleorchestrator.moduleusermanager.application.UserInternalRequest;
import co.com.ies.smolplus.context.moduleusermanager.application.UserManagerService;

public class UserInternalRequestImpl implements UserInternalRequest {

    private final UserManagerService userManagerService;

    public UserInternalRequestImpl(UserManagerService userManagerService) {
        this.userManagerService = userManagerService;
    }    
    
}
