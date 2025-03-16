package co.unicauca.gsrpi_api.review_applications.application.mapper;

import co.unicauca.gsrpi_api.applications.domain.model.Application;
import co.unicauca.gsrpi_api.applications.domain.model.StatusApplication;
import co.unicauca.gsrpi_api.review_applications.domain.model.Validation;
import co.unicauca.gsrpi_api.review_applications.domain.model.ValidationType;
import co.unicauca.gsrpi_api.review_applications.domain.model.dto.request.*;
import co.unicauca.gsrpi_api.review_applications.domain.model.dto.response.*;
import co.unicauca.gsrpi_api.user_management.domain.model.Person;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ReviewApplicationsMapper {
    List<ApplicationResponseGetAllByFacultyId> ApplicationListToApplicationResponseGetAllByFacultyIdList(List<Application> applications);
    ValidationResponse validationToValidationResponse(Validation validation);
    ValidationType validationTypeRequestToValidationType(ValidationTypeRequest validationTypeRequest);
    Person personRequestSaveValidationToPerson(PersonRequestSaveValidation personRequestSaveValidation);
    Application applicationRequestSaveValidationToApplication(ApplicationRequestSaveValidation applicationRequestSaveValidation);
    Validation validationRequestToValidation(ValidationRequest validationRequest);
    List<ValidationResponseGetAllByApplicationId> ValidationListToValidationResponseGetAllByApplicationIdList(List<Validation> validations);
    List<ValidationTypeResponseGetAll> ValidationTypeListToValidationTypeResponseGetAllList(List<ValidationType> validationTypes);
    List<StatusApplicationResponseGetAll> statusApplicationListToStatusApplicationResponseGetAllList(List<StatusApplication> statusApplications);
    ApplicationResponseUpdateStatus applicationRequestUpdateStatusToApplicationResponseUpdateStatus( ApplicationRequestUpdateStatus applicationRequestUpdateStatus);
    ApplicationResponseUpdateStatus applicationToApplicationResponseUpdateStatus(Application application);
    StatusApplication statusApplicationRequestToStatusApplication(StatusApplicationRequestUpdateStatus statusApplicationRequestUpdateStatus);
    Application applicationRequestUpdateStatusToApplication(ApplicationRequestUpdateStatus applicationRequestUpdateStatus);
}

