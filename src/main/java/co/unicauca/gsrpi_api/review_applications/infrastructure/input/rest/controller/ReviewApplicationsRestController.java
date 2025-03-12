package co.unicauca.gsrpi_api.review_applications.infrastructure.input.rest.controller;

import co.unicauca.gsrpi_api.applications.domain.model.dto.response.ApplicationResponseGetAllByTeacherId;
import co.unicauca.gsrpi_api.review_applications.application.port.input.ReviewApplicationsManagementPort;
import co.unicauca.gsrpi_api.review_applications.domain.model.ValidationType;
import co.unicauca.gsrpi_api.review_applications.domain.model.dto.request.ApplicationRequestUpdateStatus;
import co.unicauca.gsrpi_api.review_applications.domain.model.dto.request.ValidationRequest;
import co.unicauca.gsrpi_api.review_applications.domain.model.dto.response.*;
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

    @PostMapping("guardar-validacion")
    public ResponseEntity<ValidationResponse> saveValidation(@RequestBody ValidationRequest validationRequest) {
        return ResponseEntity.status(HttpStatus.CREATED).body(
                this.reviewApplicationsManagementPort.saveValidation(validationRequest)
        );
    }

    @GetMapping("obtener-listado-validaciones-por-solicitud-id/{applicationId}")
    public ResponseEntity<List<ValidationResponseGetAllByApplicationId>> getAllValidationsByApplicationId(@PathVariable Long applicationId) {
        return ResponseEntity.status(HttpStatus.OK).body(
                this.reviewApplicationsManagementPort.getAllValidationsByApplicationId(applicationId)
        );
    }

    @GetMapping("obtener-listado-tipos-validaciones")
    public ResponseEntity<List<ValidationTypeResponseGetAll>> getAllValidationTypes() {
        return ResponseEntity.status(HttpStatus.OK).body(
                this.reviewApplicationsManagementPort.getAllValidationTypes()
        );
    }

    @GetMapping("obtener-listado-estados-solicitud")
    public ResponseEntity<List<StatusApplicationResponseGetAll>> getAllStatusApplications() {
        return ResponseEntity.status(HttpStatus.OK).body(
                this.reviewApplicationsManagementPort.getAllStatusApplications()
        );
    }

    @PutMapping("actualizar-estado-solicitud")
    public ResponseEntity<ApplicationResponseUpdateStatus> updateStatusApplication(@RequestBody ApplicationRequestUpdateStatus applicationRequestUpdateStatus) {
        return ResponseEntity.status(HttpStatus.OK).body(
                this.reviewApplicationsManagementPort.updateStatusApplication(applicationRequestUpdateStatus)
        );
    }

    @GetMapping("obtener-listado-validaciones-por-solicitud-id-y-persona-id/{applicationId}/{personId}")
    public ResponseEntity<List<ValidationResponseGetAllByApplicationId>> getAllValidationsByApplicationIdAndPersonId(@PathVariable Long applicationId, @PathVariable Long personId) {
        return ResponseEntity.status(HttpStatus.OK).body(
                this.reviewApplicationsManagementPort.getAllValidationsByApplicationIdAndPersonId(applicationId, personId)
        );
    }

}
