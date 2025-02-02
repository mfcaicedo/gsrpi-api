package co.unicauca.gsrpi_api.user_management.application.mapper;

import co.unicauca.gsrpi_api.auth.domain.model.Role;
import co.unicauca.gsrpi_api.auth.domain.model.User;
import co.unicauca.gsrpi_api.auth.domain.model.dto.response.RoleResponse;
import co.unicauca.gsrpi_api.auth.domain.model.dto.response.UserResponse;
import co.unicauca.gsrpi_api.user_management.domain.model.Person;
import co.unicauca.gsrpi_api.user_management.domain.model.dto.request.PersonRequest;
import co.unicauca.gsrpi_api.user_management.domain.model.dto.response.PersonResponse;
import co.unicauca.gsrpi_api.user_management.domain.model.dto.response.PersonResponseGetByUserId;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserManagementMapper {
    Person personRequestToPerson(PersonRequest personRequest);
    PersonResponse personToPersonResponse(Person person);
    RoleResponse roleToRoleResponse(Role role);
    List<RoleResponse> rolesToRolesResponse(List<Role> roles);
    UserResponse userToUserResponse(User user);
    PersonResponseGetByUserId personToPersonResponseGetByUserId(Person person);

}
