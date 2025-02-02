package co.unicauca.gsrpi_api.system_configuration.infrastructure.input.rest.controller;

import co.unicauca.gsrpi_api.auth.domain.model.dto.response.UserResponse;
import co.unicauca.gsrpi_api.system_configuration.application.port.input.GetAllFacultiesPort;
import co.unicauca.gsrpi_api.system_configuration.application.port.input.SaveConfigurationPort;
import co.unicauca.gsrpi_api.system_configuration.application.port.input.SystemConfigurationManagementPort;
import co.unicauca.gsrpi_api.system_configuration.domain.model.dto.request.ConfigurationRequest;
import co.unicauca.gsrpi_api.system_configuration.domain.model.dto.response.ConfigurationResponse;
import co.unicauca.gsrpi_api.system_configuration.domain.model.dto.response.ConfigurationResponseGetById;
import co.unicauca.gsrpi_api.system_configuration.domain.model.dto.response.FacultyResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("gsrpi-api/v1")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class SystemConfigurationRestController {
    private final GetAllFacultiesPort getAllFacultiesPort;
    private final SaveConfigurationPort saveConfigurationPort;
    private final SystemConfigurationManagementPort systemConfigurationManagementPort;

    @Autowired
    public SystemConfigurationRestController(
            GetAllFacultiesPort getAllFacultiesPort,
            SaveConfigurationPort saveConfigurationPort,
            SystemConfigurationManagementPort systemConfigurationManagementPort
    ) {
        this.getAllFacultiesPort = getAllFacultiesPort;
        this.saveConfigurationPort = saveConfigurationPort;
        this.systemConfigurationManagementPort = systemConfigurationManagementPort;
    }

    @GetMapping("obtener-facultades")
    public ResponseEntity<List<FacultyResponse>> getAllFaculties() {
        return ResponseEntity.ok(this.getAllFacultiesPort.getAllFaculties());
    }

    @PostMapping("crear-configuracion")
    public ResponseEntity<ConfigurationResponse> saveConfiguration(@RequestBody ConfigurationRequest configurationRequest) {
        return ResponseEntity.status(HttpStatus.CREATED).body(
                this.saveConfigurationPort.saveConfiguration(configurationRequest));
    }

    @GetMapping("obtener-configuracion-por-id/{idConfiguracion}")
    public ResponseEntity<ConfigurationResponseGetById> getConfigurationById(@PathVariable Long idConfiguracion) {
        return ResponseEntity.ok(this.systemConfigurationManagementPort.getConfigurationById(idConfiguracion));
    }

}
