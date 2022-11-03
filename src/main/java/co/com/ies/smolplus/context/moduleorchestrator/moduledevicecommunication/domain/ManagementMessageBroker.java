package co.com.ies.smolplus.context.moduleorchestrator.moduledevicecommunication.domain;

public class ManagementMessageBroker {



    /* pasos
        - validar el topico     
        - identificar el tipo (config , reporte, control de comm (mod com tarjeta) ) -- encargado el modulo externo de deviceCommunication
        - cambiar el estado si se llega a desconectar, mantener si sigue conectado -- encargado el modulo externo de deviceCommunication
        - genera eventos, 
        - validar el origen (homologacion) - hash -  mac 
        {
            pedir informacion al modulo device a traves de la mac enviada 
        }
        - validar la estructura correcta
        - redirigir el core del mensaje
    
    */

    
}
