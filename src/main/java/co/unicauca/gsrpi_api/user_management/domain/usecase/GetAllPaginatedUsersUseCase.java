package co.unicauca.gsrpi_api.user_management.domain.usecase;

import co.unicauca.gsrpi_api.user_management.application.input.GetAllPaginatedUsersPort;
import co.unicauca.gsrpi_api.user_management.application.output.GetAllPaginatedUsersOutPort;
import co.unicauca.gsrpi_api.user_management.domain.model.User;

import java.util.List;

public class GetAllPaginatedUsersUseCase implements GetAllPaginatedUsersPort {
    private final GetAllPaginatedUsersOutPort getAllPaginatedUsersOutPort;

    public GetAllPaginatedUsersUseCase(GetAllPaginatedUsersOutPort getAllPaginatedUsersOutPort) {
        this.getAllPaginatedUsersOutPort = getAllPaginatedUsersOutPort;
    }
    @Override
    public List<User> getAllPaginatedUsers() {
        //TODO: Llamar al puerto que se encarga de obtener los usuarios
    return this.getAllPaginatedUsersOutPort.getAllPaginatedUsers();
    }
}
