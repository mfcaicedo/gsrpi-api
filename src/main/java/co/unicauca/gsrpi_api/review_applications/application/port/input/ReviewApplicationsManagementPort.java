package co.unicauca.gsrpi_api.review_applications.application.port.input;

import co.unicauca.gsrpi_api.review_applications.domain.model.dto.request.ApplicationRequestUpdateStatus;
import co.unicauca.gsrpi_api.review_applications.domain.model.dto.request.ValidationRequest;
import co.unicauca.gsrpi_api.review_applications.domain.model.dto.response.*;

import java.util.List;

public interface ReviewApplicationsManagementPort {
    List<ApplicationResponseGetAllByFacultyId> getAllApplicationsByFacultyId(Long facultyId);

    ValidationResponse saveValidation(ValidationRequest validationRequest);
    List<ValidationResponseGetAllByApplicationId> getAllValidationsByApplicationId(Long applicationId);
    List<ValidationTypeResponseGetAll> getAllValidationTypes();
    List<StatusApplicationResponseGetAll> getAllStatusApplications();
    ApplicationResponseUpdateStatus updateStatusApplication(ApplicationRequestUpdateStatus applicationRequestUpdateStatus);
}
