package co.unicauca.gsrpi_api.review_applications.application.port.output;

import co.unicauca.gsrpi_api.applications.domain.model.Application;

import java.util.List;

public interface ReviewApplicationManagementOutPort {
    List<Application> getAllApplicationsByFacultyId(Long facultyId);
}
