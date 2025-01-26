package co.unicauca.gsrpi_api.user_management.infrastructure.input.rest.controller;

import co.unicauca.gsrpi_api.auth.domain.model.User;
import co.unicauca.gsrpi_api.auth.domain.model.dto.response.UserResponse;
import co.unicauca.gsrpi_api.user_management.application.input.UserManagementPort;
import co.unicauca.gsrpi_api.user_management.domain.model.dto.request.PersonRequest;
import co.unicauca.gsrpi_api.user_management.domain.model.dto.response.PersonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("gsrpi-api/v1")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserManagementRestController {

    private final UserManagementPort userManagementPort;

    public UserManagementRestController(UserManagementPort userManagementPort) {
        this.userManagementPort = userManagementPort;
    }

    @GetMapping("obtener-usuario-por-id/{userId}")
    public ResponseEntity<UserResponse> getUserById(@PathVariable Long userId) {
        return ResponseEntity.status(HttpStatus.OK).body(
                this.userManagementPort.getUserById(userId)
        );
    }

    @PostMapping("crear-persona")
    public ResponseEntity<PersonResponse> savePerson(@RequestBody PersonRequest personRequest) {
        return ResponseEntity.status(HttpStatus.CREATED).body(
                this.userManagementPort.savePerson(personRequest)
        );
    }

}