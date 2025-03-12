package co.unicauca.gsrpi_api.review_applications.application.port.output;

import co.unicauca.gsrpi_api.applications.domain.model.Application;
import co.unicauca.gsrpi_api.applications.domain.model.StatusApplication;
import co.unicauca.gsrpi_api.review_applications.domain.model.Validation;
import co.unicauca.gsrpi_api.review_applications.domain.model.ValidationType;

import java.util.List;

public interface ReviewApplicationManagementOutPort {
    List<Application> getAllApplicationsByFacultyId(Long facultyId);
    Validation saveValidation(Validation validation);
    List<Validation> getAllValidationsByApplicationId(Long applicationId);
    List<ValidationType> getAllValidationTypes();
    List<StatusApplication> getAllStatusApplications();
    Application updateStatusApplication(Application application);
    List<Validation> getAllValidationsByApplicationIdAndPersonId(Long applicationId, Long personId);
}
