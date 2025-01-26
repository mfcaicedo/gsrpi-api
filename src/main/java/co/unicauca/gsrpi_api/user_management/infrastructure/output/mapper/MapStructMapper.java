package co.unicauca.gsrpi_api.user_management.infrastructure.output.mapper;

import co.unicauca.gsrpi_api.auth.domain.model.Role;
import co.unicauca.gsrpi_api.auth.domain.model.User;
import co.unicauca.gsrpi_api.auth.domain.model.UserRole;
import co.unicauca.gsrpi_api.auth.infrastructure.output.entity.RoleEntity;
import co.unicauca.gsrpi_api.auth.infrastructure.output.entity.UserEntity;
import co.unicauca.gsrpi_api.auth.infrastructure.output.entity.UserRoleEntity;
import co.unicauca.gsrpi_api.user_management.domain.model.Person;
import co.unicauca.gsrpi_api.user_management.infrastructure.output.entity.PersonEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface MapStructMapper {
    Person personEntityToPerson(PersonEntity personEntity);
    PersonEntity personToPersonEntity(Person person);
    UserEntity userToUserEntity(User user);
    @Mapping(target = "userRoles", ignore = true)
    Role roleEntityToRole(RoleEntity roleEntity);
    @Mapping(target = "role", source = "role")
    @Mapping(target = "user", ignore = true)
    UserRole userRoleEntityToUserRole(UserRoleEntity userRoleEntity);
    User userEntityToUser(UserEntity userEntity);

}
