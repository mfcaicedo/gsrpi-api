package co.unicauca.gsrpi_api.applications.infrastructure.output.mapper;

import co.unicauca.gsrpi_api.applications.domain.model.*;
import co.unicauca.gsrpi_api.applications.infrastructure.output.entity.*;
import co.unicauca.gsrpi_api.system_configuration.domain.model.Department;
import co.unicauca.gsrpi_api.system_configuration.domain.model.Faculty;
import co.unicauca.gsrpi_api.system_configuration.infrastructure.output.entity.DepartmentEntity;
import co.unicauca.gsrpi_api.system_configuration.infrastructure.output.entity.FacultyEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MapStructApplicationsMapper {
    ApplicationTemp applicationTempEntityToApplicationTemp(ApplicationTempEntity applicationTempEntity);
    ApplicationTempEntity applicationTempToApplicationTempEntity(ApplicationTemp applicationTemp);
    @Mapping(target = "person", ignore = true) //Evita mapear el atributo person
    Teacher teacherEntityToTeacher(TeacherEntity teacherEntity);
    ApplicationRecognized applicationRecognizedEntityToApplicationRecognized(ApplicationRecognizedEntity applicationRecognizedEntity);
    ApplicationRecognizedEntity applicationRecognizedToApplicationRecognizedEntity(ApplicationRecognized applicationRecognized);
    TypeProduction typeProductionEntityToTypeProduction(TypeProductionEntity typeProductionEntity);
    Application applicationEntityToApplication(ApplicationEntity applicationEntity);

    TeacherApplication teacherApplicationEntityToTeacherApplication(TeacherApplicationEntity teacherApplicationEntity);
    Production productionEntityToProduction(ProductionEntity productionEntity);
    Faculty facultyEntityToFaculty(FacultyEntity facultyEntity);
    Department departmentEntityToDepartment(DepartmentEntity departmentEntity);
    StatusApplication statusApplicationEntityToStatusApplication(StatusApplicationEntity statusApplicationEntity);
    List<Application> applicationEntityListToApplicationList(List<ApplicationEntity> applicationEntityList);
}
