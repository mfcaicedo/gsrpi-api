package co.unicauca.gsrpi_api.applications.application.port.input;

import co.unicauca.gsrpi_api.applications.domain.model.dto.request.ApplicationRecognizedRequest;
import co.unicauca.gsrpi_api.applications.domain.model.dto.request.ApplicationRecognizedRequestUpdate;
import co.unicauca.gsrpi_api.applications.domain.model.dto.request.ApplicationRequestCreate;
import co.unicauca.gsrpi_api.applications.domain.model.dto.request.ApplicationTempRequest;
import co.unicauca.gsrpi_api.applications.domain.model.dto.response.*;
import co.unicauca.gsrpi_api.applications.domain.model.dto.response.get_all_application_by_applcation_status.ApplicationResponseGetAllByApplicationStatus;
import co.unicauca.gsrpi_api.applications.domain.model.dto.response.get_application_by_id.ApplicationResponseGetById;

import java.util.List;

public interface ApplicationManagementPort {

    ApplicationTempResponse createApplicationTemp(ApplicationTempRequest applicationTempRequest);

    ApplicationTempResponse updateApplicationTemp(ApplicationTempRequest applicationTempRequest);

    TeacherResponse getTeacherByPersonId(Long personId);

    ApplicationRecognizedResponse createApplicationRecognized(ApplicationRecognizedRequest applicationRecognizedRequest);

    ApplicationRecognizedResponse updateApplicationRecognized(ApplicationRecognizedRequestUpdate applicationRecognizedRequest);

    ApplicationRecognizedResponseGetByApplicationId getApplicationRecognizedByApplicationId(Long applicationId);

    TypeProductionResponse getTypeProductionById(Long typeProductionId);

    TypeProductionResponse getTypeProductionByAlias(String alias);

    ApplicationResponseCreate createApplication(ApplicationRequestCreate applicationRequestCreate);

    ApplicationTempResponseGetByTeacherId getApplicationTempByTeacherId(Long teacherId);

    List<ApplicationResponseGetAllByTeacherId> getAllApplicationByTeacherId(Long teacherId);

    ApplicationResponseGetById getApplicationById(Long applicationId);

    List<ApplicationResponseGetAllByApplicationStatus> getAllApplicationByApplicationStatus(String applicationStatus);

}
