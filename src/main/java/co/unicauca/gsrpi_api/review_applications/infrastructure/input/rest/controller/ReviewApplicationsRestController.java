package co.unicauca.gsrpi_api.review_applications.infrastructure.input.rest.controller;

import co.unicauca.gsrpi_api.applications.domain.model.dto.response.ApplicationResponseGetAllByTeacherId;
import co.unicauca.gsrpi_api.review_applications.application.port.input.ReviewApplicationsManagementPort;
import co.unicauca.gsrpi_api.review_applications.domain.model.dto.response.ApplicationResponseGetAllByFacultyId;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("gsrpi-api/v1")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ReviewApplicationsRestController {
    private final ReviewApplicationsManagementPort reviewApplicationsManagementPort;

    public ReviewApplicationsRestController(ReviewApplicationsManagementPort reviewApplicationsManagementPort) {
        this.reviewApplicationsManagementPort = reviewApplicationsManagementPort;
    }

    @GetMapping("obtener-listado-solicitudes-por-facultad-id/{facultyId}")
    public ResponseEntity<List<ApplicationResponseGetAllByFacultyId>> getAllApplicationByTeacherId(@PathVariable Long facultyId) {
        return ResponseEntity.status(HttpStatus.OK).body(
                this.reviewApplicationsManagementPort.getAllApplicationsByFacultyId(facultyId)
        );
    }

}
