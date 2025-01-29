package co.unicauca.gsrpi_api.applications.application.port.input;

import co.unicauca.gsrpi_api.applications.domain.model.dto.request.ApplicationTempRequest;
import co.unicauca.gsrpi_api.applications.domain.model.dto.response.ApplicationTempResponse;
import co.unicauca.gsrpi_api.applications.domain.model.dto.response.TeacherResponse;

public interface ApplicationManagementPort {
    ApplicationTempResponse createApplicationTemp(ApplicationTempRequest applicationTempRequest);
    ApplicationTempResponse updateApplicationTemp(ApplicationTempRequest applicationTempRequest);
    TeacherResponse getTeacherByPersonId(Long personId);
}
