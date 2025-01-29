package co.unicauca.gsrpi_api.applications.application.mapper;

import co.unicauca.gsrpi_api.applications.domain.model.ApplicationRecognized;
import co.unicauca.gsrpi_api.applications.domain.model.ApplicationTemp;
import co.unicauca.gsrpi_api.applications.domain.model.Teacher;
import co.unicauca.gsrpi_api.applications.domain.model.TypeProduction;
import co.unicauca.gsrpi_api.applications.domain.model.dto.request.ApplicationRecognizedRequest;
import co.unicauca.gsrpi_api.applications.domain.model.dto.request.ApplicationTempRequest;
import co.unicauca.gsrpi_api.applications.domain.model.dto.response.ApplicationRecognizedResponse;
import co.unicauca.gsrpi_api.applications.domain.model.dto.response.ApplicationTempResponse;
import co.unicauca.gsrpi_api.applications.domain.model.dto.response.TeacherResponse;
import co.unicauca.gsrpi_api.applications.domain.model.dto.response.TypeProductionResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ApplicationsMapper {
    ApplicationTemp applicationTempRequestToApplicationTemp(ApplicationTempRequest applicationTempRequest);
    ApplicationTempResponse applicationTempToApplicationTempResponse(ApplicationTemp applicationTemp);
    TeacherResponse teacherToTeacherResponse(Teacher teacher);
    ApplicationRecognizedResponse ApplicationRecognizedToApplicationRecognizedResponse(ApplicationRecognized applicationRecognized);
    ApplicationRecognized applicationRecognizedRequestToApplicationRecognized(ApplicationRecognizedRequest applicationRecognizedRequest);
    TypeProductionResponse typeProductionToTypeProductionResponse(TypeProduction typeProduction);
}
