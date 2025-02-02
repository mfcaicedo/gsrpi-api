package co.unicauca.gsrpi_api.user_management.application.usecase;

import co.unicauca.gsrpi_api.auth.domain.model.dto.response.UserResponse;
import co.unicauca.gsrpi_api.user_management.application.input.UserManagementPort;
import co.unicauca.gsrpi_api.user_management.application.mapper.UserManagementMapper;
import co.unicauca.gsrpi_api.user_management.application.output.UserManagementOutPort;
import co.unicauca.gsrpi_api.user_management.domain.model.Person;
import co.unicauca.gsrpi_api.user_management.domain.model.dto.request.PersonRequest;
import co.unicauca.gsrpi_api.user_management.domain.model.dto.response.PersonResponse;
import co.unicauca.gsrpi_api.user_management.domain.model.dto.response.PersonResponseGetByUserId;

public class UserMangementUseCase implements UserManagementPort {
    private final UserManagementOutPort userManagementOutPort;
    private final UserManagementMapper mapper;

    public UserMangementUseCase(UserManagementOutPort userManagementOutPort, UserManagementMapper mapper) {
        this.userManagementOutPort = userManagementOutPort;
        this.mapper = mapper;
    }

    @Override
    public PersonResponse savePerson(PersonRequest personRequest) {
        Person person = this.mapper.personRequestToPerson(personRequest);
        return this.mapper.personToPersonResponse(
                this.userManagementOutPort.savePerson(person));
    }

    @Override
    public UserResponse getUserById(long userId) {
        return this.mapper.userToUserResponse(this.userManagementOutPort.getUserById(userId));
    }

    @Override
    public UserResponse getPersonByUid(String uid) {
        return this.mapper.userToUserResponse(this.userManagementOutPort.getPersonByUid(uid));
    }

    @Override
    public PersonResponseGetByUserId getPersonByUserId(long userId) {
        return this.mapper.personToPersonResponseGetByUserId(this.userManagementOutPort.getPersonByUserId(userId));
    }
}
