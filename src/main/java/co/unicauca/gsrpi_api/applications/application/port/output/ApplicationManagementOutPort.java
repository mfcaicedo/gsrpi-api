package co.unicauca.gsrpi_api.applications.application.port.output;

import co.unicauca.gsrpi_api.applications.domain.model.*;
import co.unicauca.gsrpi_api.applications.domain.model.dto.request.ApplicationRequestCreate;

import java.util.List;

public interface ApplicationManagementOutPort {
    ApplicationTemp createApplicationTemp(ApplicationTemp applicationTemp);

    ApplicationTemp updateApplicationTemp(ApplicationTemp applicationTemp);

    Teacher getTeacherByPersonId(Long personId);

    ApplicationRecognized createApplicationRecognized(ApplicationRecognized applicationRecognized);

    ApplicationRecognized updateApplicationRecognized(ApplicationRecognized applicationRecognized);

    ApplicationRecognized getApplicationRecognizedByApplicationId(Long applicationId);

    TypeProduction getTypeProductionById(Long typeProductionId);

    TypeProduction getTypeProductionByAlias(String alias);

    Application createApplication(ApplicationRequestCreate application);

    ApplicationTemp getApplicationTempByTeacherId(Long teacherId);

    List<Application> getAllApplicationByTeacherId(Long teacherId);

    Application getApplicationById(Long applicationId);

    List<Application> getAllApplicationByApplicationStatus(String applicationStatus);

}
