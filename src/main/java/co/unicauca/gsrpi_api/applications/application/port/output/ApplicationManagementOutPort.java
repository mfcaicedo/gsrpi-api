package co.unicauca.gsrpi_api.applications.application.port.output;

import co.unicauca.gsrpi_api.applications.domain.model.*;
import co.unicauca.gsrpi_api.applications.domain.model.dto.request.ApplicationRequestCreate;

public interface ApplicationManagementOutPort {
    ApplicationTemp createApplicationTemp(ApplicationTemp applicationTemp);
    ApplicationTemp updateApplicationTemp(ApplicationTemp applicationTemp);
    Teacher getTeacherByPersonId(Long personId);
    ApplicationRecognized createApplicationRecognized(ApplicationRecognized applicationRecognized);
    TypeProduction getTypeProductionById(Long typeProductionId);
    TypeProduction getTypeProductionByAlias(String alias);
    Application createApplication(ApplicationRequestCreate application);
}
