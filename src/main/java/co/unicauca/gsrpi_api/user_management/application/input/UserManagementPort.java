package co.unicauca.gsrpi_api.user_management.application.input;

import co.unicauca.gsrpi_api.auth.domain.model.dto.response.UserResponse;
import co.unicauca.gsrpi_api.user_management.domain.model.dto.request.PersonRequest;
import co.unicauca.gsrpi_api.user_management.domain.model.dto.response.PersonResponse;

public interface UserManagementPort {
    PersonResponse savePerson(PersonRequest personRequest);
    UserResponse getUserById(long userId);
}
