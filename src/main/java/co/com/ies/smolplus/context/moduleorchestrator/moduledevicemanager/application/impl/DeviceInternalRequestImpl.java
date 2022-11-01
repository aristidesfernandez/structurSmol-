package co.com.ies.smolplus.context.moduleorchestrator.moduledevicemanager.application.impl;

import co.com.ies.smolplus.context.moduledevicemanager.application.DeviceManagerService;
import co.com.ies.smolplus.context.moduleorchestrator.moduledevicemanager.application.DeviceInternalRequest;


public class DeviceInternalRequestImpl implements DeviceInternalRequest {

    private final DeviceManagerService deviceManagerService;

    public DeviceInternalRequestImpl(DeviceManagerService deviceManagerService) {
        this.deviceManagerService = deviceManagerService;
    }    
    
}
