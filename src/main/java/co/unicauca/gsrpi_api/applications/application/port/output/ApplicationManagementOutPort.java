package co.unicauca.gsrpi_api.applications.application.port.output;

import co.unicauca.gsrpi_api.applications.domain.model.ApplicationTemp;

public interface ApplicationManagementOutPort {
    ApplicationTemp createApplicationTemp(ApplicationTemp applicationTemp);
    ApplicationTemp updateApplicationTemp(ApplicationTemp applicationTemp);
}
