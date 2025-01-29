package co.unicauca.gsrpi_api.applications.application.port.output;

import co.unicauca.gsrpi_api.applications.domain.model.ApplicationTemp;
import co.unicauca.gsrpi_api.applications.domain.model.Teacher;

public interface ApplicationManagementOutPort {
    ApplicationTemp createApplicationTemp(ApplicationTemp applicationTemp);
    ApplicationTemp updateApplicationTemp(ApplicationTemp applicationTemp);
    Teacher getTeacherByPersonId(Long personId);
}
