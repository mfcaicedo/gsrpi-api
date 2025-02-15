package co.unicauca.gsrpi_api.applications.infrastructure.input.rest.controller;

import co.unicauca.gsrpi_api.applications.application.port.input.ApplicationManagementPort;
import co.unicauca.gsrpi_api.applications.domain.model.dto.request.ApplicationRecognizedRequest;
import co.unicauca.gsrpi_api.applications.domain.model.dto.request.ApplicationRecognizedRequestUpdate;
import co.unicauca.gsrpi_api.applications.domain.model.dto.request.ApplicationRequestCreate;
import co.unicauca.gsrpi_api.applications.domain.model.dto.request.ApplicationTempRequest;
import co.unicauca.gsrpi_api.applications.domain.model.dto.response.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("obtener-solicitud-temporal-por-docente-id/{teacherId}")
    public ResponseEntity<ApplicationTempResponseGetByTeacherId> getTeacherById(@PathVariable Long teacherId) {
        return ResponseEntity.status(HttpStatus.OK).body(
                this.applicationManagementPort.getApplicationTempByTeacherId(teacherId)
        );
    }

    @GetMapping("obtener-docente-por-id-persona/{personId}")
    public ResponseEntity<TeacherResponse> getTeacherByPersonId(@PathVariable Long personId) {
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
    @PatchMapping("actualizar-solicitud-reconocida")
    public ResponseEntity<ApplicationRecognizedResponse> updateRecognizedApplication(@RequestBody ApplicationRecognizedRequestUpdate applicationRecognizedRequest) {
        return ResponseEntity.status(HttpStatus.OK).body(
                this.applicationManagementPort.updateApplicationRecognized(applicationRecognizedRequest)
        );
    }
    @GetMapping("obtener-solicitud-reconocida-por-solicitud-id/{solicitudId}")
    public ResponseEntity<ApplicationRecognizedResponseGetByApplicationId> getRecognizedApplicationByTeacherId(@PathVariable Long solicitudId) {
        return ResponseEntity.status(HttpStatus.OK).body(
                this.applicationManagementPort.getApplicationRecognizedByApplicationId(solicitudId)
        );
    }

    @GetMapping("obtener-tipo-produccion-por-id/{typeProductionId}")
    public ResponseEntity<TypeProductionResponse> getTypeProductionById(@PathVariable Long typeProductionId) {
        return ResponseEntity.status(HttpStatus.OK).body(
                this.applicationManagementPort.getTypeProductionById(typeProductionId)
        );
    }

    @GetMapping("obtener-tipo-produccion-por-alias/{alias}")
    public ResponseEntity<TypeProductionResponse> getTypeProductionByAlias(@PathVariable String alias) {
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

    @GetMapping("obtener-solicitud-por-docente-id/{teacherId}")
    public ResponseEntity<List<ApplicationResponseGetAllByTeacherId>> getAllApplicationByTeacherId(@PathVariable Long teacherId) {
        return ResponseEntity.status(HttpStatus.OK).body(
                this.applicationManagementPort.getAllApplicationByTeacherId(teacherId)
        );
    }

}
