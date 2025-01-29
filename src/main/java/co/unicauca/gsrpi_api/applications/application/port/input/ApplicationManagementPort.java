package co.unicauca.gsrpi_api.applications.application.port.input;

import co.unicauca.gsrpi_api.applications.domain.model.TypeProduction;
import co.unicauca.gsrpi_api.applications.domain.model.dto.request.ApplicationRecognizedRequest;
import co.unicauca.gsrpi_api.applications.domain.model.dto.request.ApplicationTempRequest;
import co.unicauca.gsrpi_api.applications.domain.model.dto.response.ApplicationRecognizedResponse;
import co.unicauca.gsrpi_api.applications.domain.model.dto.response.ApplicationTempResponse;
import co.unicauca.gsrpi_api.applications.domain.model.dto.response.TeacherResponse;
import co.unicauca.gsrpi_api.applications.domain.model.dto.response.TypeProductionResponse;

public interface ApplicationManagementPort {
    ApplicationTempResponse createApplicationTemp(ApplicationTempRequest applicationTempRequest);
    ApplicationTempResponse updateApplicationTemp(ApplicationTempRequest applicationTempRequest);
    TeacherResponse getTeacherByPersonId(Long personId);
    ApplicationRecognizedResponse createApplicationRecognized(ApplicationRecognizedRequest applicationRecognizedRequest);
    TypeProductionResponse getTypeProductionById(Long typeProductionId);
    TypeProductionResponse getTypeProductionByAlias(String alias);

}
