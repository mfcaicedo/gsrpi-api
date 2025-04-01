package co.unicauca.gsrpi_api.applications.application.mapper;

import co.unicauca.gsrpi_api.applications.domain.model.*;
import co.unicauca.gsrpi_api.applications.domain.model.dto.request.ApplicationRecognizedRequest;
import co.unicauca.gsrpi_api.applications.domain.model.dto.request.ApplicationRecognizedRequestUpdate;
import co.unicauca.gsrpi_api.applications.domain.model.dto.request.ApplicationTempRequest;
import co.unicauca.gsrpi_api.applications.domain.model.dto.response.*;
import co.unicauca.gsrpi_api.applications.domain.model.dto.response.get_all_application_by_applcation_status.ApplicationResponseGetAllByApplicationStatus;
import co.unicauca.gsrpi_api.applications.domain.model.dto.response.get_all_application_by_applcation_status.FacultyResponseGetAllByApplicationStatus;
import co.unicauca.gsrpi_api.applications.domain.model.dto.response.get_all_application_by_applcation_status.TeacherApplicationResponseGetAllByApplicationStatus;
import co.unicauca.gsrpi_api.applications.domain.model.dto.response.get_all_application_by_applcation_status.TeacherResponseGetAllByApplicationStatus;
import co.unicauca.gsrpi_api.applications.domain.model.dto.response.get_application_by_id.*;
import co.unicauca.gsrpi_api.system_configuration.domain.model.Department;
import co.unicauca.gsrpi_api.system_configuration.domain.model.Faculty;
import co.unicauca.gsrpi_api.user_management.domain.model.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ApplicationsMapper {
    ApplicationTemp applicationTempRequestToApplicationTemp(ApplicationTempRequest applicationTempRequest);

    ApplicationTempResponse applicationTempToApplicationTempResponse(ApplicationTemp applicationTemp);

    ApplicationTempResponseGetByTeacherId applicationTempToApplicationTempResponseGetByTeacherId(ApplicationTemp applicationTemp);

    TeacherResponse teacherToTeacherResponse(Teacher teacher);

    ApplicationRecognizedResponse ApplicationRecognizedToApplicationRecognizedResponse(ApplicationRecognized applicationRecognized);

    ApplicationRecognized applicationRecognizedRequestToApplicationRecognized(ApplicationRecognizedRequest applicationRecognizedRequest);

    ApplicationRecognized applicationRecognizedRequestUpdateToApplicationRecognized(ApplicationRecognizedRequestUpdate applicationRecognizedRequestUpdate);

    ApplicationRecognizedResponseGetByApplicationId applicationRecognizedToApplicationRecognizedResponseGetByApplicationId(ApplicationRecognized applicationRecognized);

    TypeProductionResponse typeProductionToTypeProductionResponse(TypeProduction typeProduction);

    ApplicationResponseCreate applicationToApplicationResponseCreate(Application application);

    List<ApplicationResponseGetAllByTeacherId> applicationListToApplicationResponseGetAllByTeacherId(List<Application> applications);

    DepartmentResponseGetById departmentToDepartmentResponseGetById(Department department);

    PersonResponseGetById personToPersonResponseGetById(Person person);
    ProductionFileResponseGetById productionFileToProductionFileResponseGetById(ProductionFile productionFile);
    List<ProductionResponseGetById> productionListToProductionResponseGetById(List<ProductionFile> productionFiles);
    ProductionResponseGetById productionToProductionResponseGetById(Production production);
    TeacherApplicationGetById teacherApplicationToTeacherApplicationGetById(TeacherApplication teacherApplication);
    List<TeacherApplicationGetById> teacherApplicationListToTeacherApplicationGetById(List<TeacherApplication> teacherApplications);
    FacultyResponseGetAllByApplicationStatus facultyToFacultyResponseGetAllByApplicationStatus(Faculty faculty);
    TeacherResponseGetById teacherToTeacherResponseGetById(Teacher teacher);
    TypeProductionResponseGetById typeProductionToTypeProductionResponseGetById(TypeProduction typeProduction);
    ApplicationResponseGetById applicationToApplicationResponseGetById(Application application);
    List<ApplicationResponseGetAllByApplicationStatus> applicationListToApplicationResponseGetAllByApplicationStatusList(List<Application> applications);
}
