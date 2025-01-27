package co.unicauca.gsrpi_api.applications.infrastructure.input.rest.controller;

import co.unicauca.gsrpi_api.applications.application.port.input.ApplicationManagementPort;
import co.unicauca.gsrpi_api.applications.domain.model.dto.request.ApplicationTempRequest;
import co.unicauca.gsrpi_api.applications.domain.model.dto.response.ApplicationTempResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("gsrpi-api/v1")
public class ApplicationManagementRestController {
    private final ApplicationManagementPort applicationManagementPort;

    public ApplicationManagementRestController(ApplicationManagementPort applicationManagementPort) {
        this.applicationManagementPort = applicationManagementPort;
    }

    @PostMapping("crear-solicitud-temporal")
    public ResponseEntity<ApplicationTempResponse> createTemporaryApplication(@RequestBody ApplicationTempRequest applicationTempRequest) {
        return ResponseEntity.status(HttpStatus.CREATED).body(
                this.applicationManagementPort.createApplicationTemp(applicationTempRequest)
        );
    }

    @PatchMapping("actualizar-solicitud-temporal")
    public ResponseEntity<ApplicationTempResponse> updateTemporaryApplication(@RequestBody ApplicationTempRequest applicationTempRequest) {
        return ResponseEntity.status(HttpStatus.OK).body(
                this.applicationManagementPort.updateApplicationTemp(applicationTempRequest)
        );
    }
}
