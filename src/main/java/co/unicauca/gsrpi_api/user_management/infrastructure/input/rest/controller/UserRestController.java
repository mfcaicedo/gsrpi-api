package co.unicauca.gsrpi_api.user_management.infrastructure.input.rest.controller;

import co.unicauca.gsrpi_api.user_management.application.input.GetAllPaginatedUsersPort;
import co.unicauca.gsrpi_api.user_management.domain.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("gsrpi-api/api")
@CrossOrigin(origins = "*", allowedHeaders = "POST, GET, PUT, DELETE, OPTIONS, PATCH")
public class UserRestController {

    private final GetAllPaginatedUsersPort getAllPaginatedUsersPort;
    @Autowired
    public UserRestController(GetAllPaginatedUsersPort getAllPaginatedUsersPort) {
        this.getAllPaginatedUsersPort = getAllPaginatedUsersPort;
    }

    @GetMapping("obtener-usuarios-paginados")
    public List<User> getUsersPaginated() {
        return this.getAllPaginatedUsersPort.getAllPaginatedUsers();
    }
}