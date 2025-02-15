package co.unicauca.gsrpi_api.applications.application.mapper;

import co.unicauca.gsrpi_api.applications.domain.model.*;
import co.unicauca.gsrpi_api.applications.domain.model.dto.request.ApplicationRecognizedRequest;
import co.unicauca.gsrpi_api.applications.domain.model.dto.request.ApplicationRecognizedRequestUpdate;
import co.unicauca.gsrpi_api.applications.domain.model.dto.request.ApplicationTempRequest;
import co.unicauca.gsrpi_api.applications.domain.model.dto.response.*;
import org.mapstruct.Mapper;

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
}
