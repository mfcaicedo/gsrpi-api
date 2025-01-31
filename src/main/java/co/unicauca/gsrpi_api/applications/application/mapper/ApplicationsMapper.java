package co.unicauca.gsrpi_api.applications.application.mapper;

import co.unicauca.gsrpi_api.applications.domain.model.*;
import co.unicauca.gsrpi_api.applications.domain.model.dto.request.ApplicationRecognizedRequest;
import co.unicauca.gsrpi_api.applications.domain.model.dto.request.ApplicationTempRequest;
import co.unicauca.gsrpi_api.applications.domain.model.dto.response.*;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ApplicationsMapper {
    ApplicationTemp applicationTempRequestToApplicationTemp(ApplicationTempRequest applicationTempRequest);
    ApplicationTempResponse applicationTempToApplicationTempResponse(ApplicationTemp applicationTemp);
    TeacherResponse teacherToTeacherResponse(Teacher teacher);
    ApplicationRecognizedResponse ApplicationRecognizedToApplicationRecognizedResponse(ApplicationRecognized applicationRecognized);
    ApplicationRecognized applicationRecognizedRequestToApplicationRecognized(ApplicationRecognizedRequest applicationRecognizedRequest);
    TypeProductionResponse typeProductionToTypeProductionResponse(TypeProduction typeProduction);
    ApplicationResponseCreate applicationToApplicationResponseCreate(Application application);
}
