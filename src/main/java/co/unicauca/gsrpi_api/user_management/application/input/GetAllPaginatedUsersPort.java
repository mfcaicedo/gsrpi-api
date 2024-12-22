package co.unicauca.gsrpi_api.user_management.application.input;

import co.unicauca.gsrpi_api.user_management.domain.model.User;

import java.util.List;

public interface GetAllPaginatedUsersPort {
    List<User> getAllPaginatedUsers();
}
