package co.unicauca.gsrpi_api.review_applications.application.usecase;

import co.unicauca.gsrpi_api.review_applications.application.mapper.ReviewApplicationsMapper;
import co.unicauca.gsrpi_api.review_applications.application.port.input.ReviewApplicationsManagementPort;
import co.unicauca.gsrpi_api.review_applications.application.port.output.ReviewApplicationManagementOutPort;
import co.unicauca.gsrpi_api.review_applications.domain.model.dto.response.ApplicationResponseGetAllByFacultyId;

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
}
