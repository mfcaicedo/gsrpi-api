package co.unicauca.gsrpi_api.applications.infrastructure.input.rest.controller;

import co.unicauca.gsrpi_api.applications.application.port.input.ApplicationManagementPort;
import co.unicauca.gsrpi_api.applications.domain.model.dto.request.ApplicationRecognizedRequest;
import co.unicauca.gsrpi_api.applications.domain.model.dto.request.ApplicationRequestCreate;
import co.unicauca.gsrpi_api.applications.domain.model.dto.request.ApplicationTempRequest;
import co.unicauca.gsrpi_api.applications.domain.model.dto.response.ApplicationRecognizedResponse;
import co.unicauca.gsrpi_api.applications.domain.model.dto.response.ApplicationResponseCreate;
import co.unicauca.gsrpi_api.applications.domain.model.dto.response.ApplicationTempResponse;
import co.unicauca.gsrpi_api.applications.domain.model.dto.response.TeacherResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("gsrpi-api/v1")
@CrossOrigin(origins = "*", allowedHeaders = "*")
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

    @GetMapping("obtener-docente-por-id-persona/{personId}")
    public ResponseEntity<TeacherResponse> getTeacherByPersonId(@PathVariable Long personId) {
        System.out.println("person id: " + personId);
        return ResponseEntity.status(HttpStatus.OK).body(
                this.applicationManagementPort.getTeacherByPersonId(personId)
        );
    }

    @PostMapping("crear-solicitud-reconocida")
    public ResponseEntity<ApplicationRecognizedResponse> createRecognizedApplication(@RequestBody ApplicationRecognizedRequest applicationRecognizedRequest) {
        return ResponseEntity.status(HttpStatus.CREATED).body(
                this.applicationManagementPort.createApplicationRecognized(applicationRecognizedRequest)
        );
    }

    @GetMapping("obtener-tipo-produccion-por-id/{typeProductionId}")
    public ResponseEntity<?> getTypeProductionById(@PathVariable Long typeProductionId) {
        return ResponseEntity.status(HttpStatus.OK).body(
                this.applicationManagementPort.getTypeProductionById(typeProductionId)
        );
    }

    @GetMapping("obtener-tipo-produccion-por-alias/{alias}")
    public ResponseEntity<?> getTypeProductionByAlias(@PathVariable String alias) {
        return ResponseEntity.status(HttpStatus.OK).body(
                this.applicationManagementPort.getTypeProductionByAlias(alias)
        );
    }

    @PostMapping("crear-solicitud")
    public ResponseEntity<ApplicationResponseCreate> createApplication(@RequestBody ApplicationRequestCreate applicationRequestCreate) {
        return ResponseEntity.status(HttpStatus.CREATED).body(
                this.applicationManagementPort.createApplication(applicationRequestCreate)
        );
    }

}
