package co.unicauca.gsrpi_api.review_applications.application.usecase;

import co.unicauca.gsrpi_api.applications.domain.model.Application;
import co.unicauca.gsrpi_api.review_applications.application.mapper.ReviewApplicationsMapper;
import co.unicauca.gsrpi_api.review_applications.application.port.input.ReviewApplicationsManagementPort;
import co.unicauca.gsrpi_api.review_applications.application.port.output.ReviewApplicationManagementOutPort;
import co.unicauca.gsrpi_api.review_applications.domain.model.Validation;
import co.unicauca.gsrpi_api.review_applications.domain.model.dto.request.ApplicationRequestUpdateStatus;
import co.unicauca.gsrpi_api.review_applications.domain.model.dto.request.ValidationRequest;
import co.unicauca.gsrpi_api.review_applications.domain.model.dto.response.*;

import java.util.List;

public class ReviewApplicationsManagementUseCase implements ReviewApplicationsManagementPort {
    private final ReviewApplicationManagementOutPort reviewApplicationManagementOutPort;
    private final ReviewApplicationsMapper reviewApplicationsMapper;

    public ReviewApplicationsManagementUseCase(ReviewApplicationManagementOutPort reviewApplicationManagementOutPort, ReviewApplicationsMapper reviewApplicationsMapper) {
        this.reviewApplicationManagementOutPort = reviewApplicationManagementOutPort;
        this.reviewApplicationsMapper = reviewApplicationsMapper;
    }

    @Override
    public List<ApplicationResponseGetAllByFacultyId> getAllApplicationsByFacultyId(Long facultyId) {
        return this.reviewApplicationsMapper.ApplicationListToApplicationResponseGetAllByFacultyIdList(
                this.reviewApplicationManagementOutPort.getAllApplicationsByFacultyId(facultyId)
        );
    }

    @Override
    public ValidationResponse saveValidation(ValidationRequest validationRequest) {
        Validation validation = this.reviewApplicationsMapper.validationRequestToValidation(validationRequest);
        return this.reviewApplicationsMapper.validationToValidationResponse(this.reviewApplicationManagementOutPort.saveValidation(
                this.reviewApplicationsMapper.validationRequestToValidation(validationRequest))
        );
    }

    @Override
    public List<ValidationResponseGetAllByApplicationId> getAllValidationsByApplicationId(Long applicationId) {
        return this.reviewApplicationsMapper.ValidationListToValidationResponseGetAllByApplicationIdList(
                this.reviewApplicationManagementOutPort.getAllValidationsByApplicationId(applicationId)
        );
    }

    @Override
    public List<ValidationTypeResponseGetAll> getAllValidationTypes() {
        return this.reviewApplicationsMapper.ValidationTypeListToValidationTypeResponseGetAllList(
                this.reviewApplicationManagementOutPort.getAllValidationTypes()
        );
    }

    @Override
    public List<StatusApplicationResponseGetAll> getAllStatusApplications() {
        return this.reviewApplicationsMapper.statusApplicationListToStatusApplicationResponseGetAllList(
                this.reviewApplicationManagementOutPort.getAllStatusApplications()
        );
    }

    @Override
    public ApplicationResponseUpdateStatus updateStatusApplication(ApplicationRequestUpdateStatus applicationRequestUpdateStatus) {
        return this.reviewApplicationsMapper.applicationToApplicationResponseUpdateStatus(
                this.reviewApplicationManagementOutPort.updateStatusApplication(
                        this.reviewApplicationsMapper.applicationRequestUpdateStatusToApplication(applicationRequestUpdateStatus)
                )
        );
    }

    @Override
    public List<ValidationResponseGetAllByApplicationId> getAllValidationsByApplicationIdAndPersonId(Long applicationId, Long personId) {
        return this.reviewApplicationsMapper.ValidationListToValidationResponseGetAllByApplicationIdList(
                this.reviewApplicationManagementOutPort.getAllValidationsByApplicationIdAndPersonId(applicationId, personId)
        );
    }
}
