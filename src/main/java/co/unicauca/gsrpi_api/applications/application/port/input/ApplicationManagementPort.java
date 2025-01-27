package co.unicauca.gsrpi_api.applications.application.port.input;

import co.unicauca.gsrpi_api.applications.domain.model.dto.request.ApplicationTempRequest;
import co.unicauca.gsrpi_api.applications.domain.model.dto.response.ApplicationTempResponse;

public interface ApplicationManagementPort {
    ApplicationTempResponse createApplicationTemp(ApplicationTempRequest applicationTempRequest);
    ApplicationTempResponse updateApplicationTemp(ApplicationTempRequest applicationTempRequest);
}
