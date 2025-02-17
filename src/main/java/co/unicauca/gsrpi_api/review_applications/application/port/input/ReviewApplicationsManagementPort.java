package co.unicauca.gsrpi_api.review_applications.application.port.input;

import co.unicauca.gsrpi_api.review_applications.domain.model.dto.response.ApplicationResponseGetAllByFacultyId;

import java.util.List;

public interface ReviewApplicationsManagementPort {
    List<ApplicationResponseGetAllByFacultyId> getAllApplicationsByFacultyId(Long facultyId);
}
