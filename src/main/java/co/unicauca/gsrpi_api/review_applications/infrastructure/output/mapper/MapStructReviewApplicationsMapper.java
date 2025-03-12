package co.unicauca.gsrpi_api.review_applications.infrastructure.output.mapper;

import co.unicauca.gsrpi_api.applications.domain.model.Application;
import co.unicauca.gsrpi_api.applications.domain.model.StatusApplication;
import co.unicauca.gsrpi_api.applications.infrastructure.output.entity.ApplicationEntity;
import co.unicauca.gsrpi_api.applications.infrastructure.output.entity.StatusApplicationEntity;
import co.unicauca.gsrpi_api.auth.domain.model.Role;
import co.unicauca.gsrpi_api.auth.domain.model.UserRole;
import co.unicauca.gsrpi_api.auth.infrastructure.output.entity.RoleEntity;
import co.unicauca.gsrpi_api.auth.infrastructure.output.entity.UserRoleEntity;
import co.unicauca.gsrpi_api.review_applications.domain.model.Validation;
import co.unicauca.gsrpi_api.review_applications.domain.model.ValidationType;
import co.unicauca.gsrpi_api.review_applications.infrastructure.output.entity.ValidationEntity;
import co.unicauca.gsrpi_api.review_applications.infrastructure.output.entity.ValidationTypeEntity;
import co.unicauca.gsrpi_api.user_management.domain.model.Person;
import co.unicauca.gsrpi_api.user_management.infrastructure.output.entity.PersonEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MapStructReviewApplicationsMapper {
    List<Application> applicationEntityListToApplicationList(List<ApplicationEntity> applicationEntityList);
    @Mapping(target = "userRoles", ignore = true)
    Role roleEntityToRole(RoleEntity roleEntity);
    @Mapping(target = "role", source = "role")
    @Mapping(target = "user", ignore = true)
    UserRole userRoleEntityToUserRole(UserRoleEntity userRoleEntity);
    @Mapping(target = "person.user", ignore = false)
//    @Mapping(target = "person.user.userRoles.user", ignore = true)
//    @Mapping(target = "person.user.userRoles.role", ignore = true)
//    @Mapping(target = "person.user.userRoles.role.userRoles.user", ignore = true)
//    @Mapping(target = "person.user.userRoles.role.userRoles.role", ignore = true)
    Validation validationEntityToValidation(ValidationEntity validationEntity);
    ValidationEntity validationToValidationEntity(Validation validation);
    List<Validation> validationEntityListToValidationList(List<ValidationEntity> validationEntityList);
    ValidationType validationTypeEntityToValidationType(ValidationTypeEntity validationTypeEntity);
    List<ValidationType> validationTypeEntityListToValidationTypeList(List<ValidationTypeEntity> validationTypeEntityList);
    Application aplicationEntityToApplication(ApplicationEntity applicationEntity);
    @Mapping(target = "user", ignore = true)
    Person personEntityToPerson(PersonEntity personEntity);
    List<StatusApplication> statusApplicationEntityListToStatusApplicationList(List<StatusApplicationEntity> statusApplicationEntityList);
    ApplicationEntity applicationToApplicationEntity(Application application);

}
