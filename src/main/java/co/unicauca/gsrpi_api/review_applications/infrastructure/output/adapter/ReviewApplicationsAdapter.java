package co.unicauca.gsrpi_api.review_applications.infrastructure.output.adapter;

import co.unicauca.gsrpi_api.applications.domain.model.Application;
import co.unicauca.gsrpi_api.applications.infrastructure.output.repository.ApplicationRepository;
import co.unicauca.gsrpi_api.review_applications.application.port.output.ReviewApplicationManagementOutPort;
import co.unicauca.gsrpi_api.review_applications.infrastructure.output.mapper.MapStructReviewApplicationsMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class ReviewApplicationsAdapter implements ReviewApplicationManagementOutPort {

    private final ApplicationRepository applicationRepository;
    private final MapStructReviewApplicationsMapper mapStructReviewApplicationsMapper;

    public ReviewApplicationsAdapter(ApplicationRepository applicationRepository, MapStructReviewApplicationsMapper mapStructReviewApplicationsMapper) {
        this.applicationRepository = applicationRepository;
        this.mapStructReviewApplicationsMapper = mapStructReviewApplicationsMapper;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Application> getAllApplicationsByFacultyId(Long facultyId) {
        return this.mapStructReviewApplicationsMapper.applicationEntityListToApplicationList(
                this.applicationRepository.findAllByDepartment_Faculty_FacultyId(facultyId)
        );
    }
}
