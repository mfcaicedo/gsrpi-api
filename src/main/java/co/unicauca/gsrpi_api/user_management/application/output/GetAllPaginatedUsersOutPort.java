package co.unicauca.gsrpi_api.user_management.application.output;

import co.unicauca.gsrpi_api.user_management.domain.model.User;

import java.util.List;

public interface GetAllPaginatedUsersOutPort {
    List<User> getAllPaginatedUsers();
}
