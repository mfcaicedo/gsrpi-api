package co.unicauca.gsrpi_api.applications.infrastructure.output.mapper;

import co.unicauca.gsrpi_api.applications.domain.model.*;
import co.unicauca.gsrpi_api.applications.infrastructure.output.entity.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

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
}
