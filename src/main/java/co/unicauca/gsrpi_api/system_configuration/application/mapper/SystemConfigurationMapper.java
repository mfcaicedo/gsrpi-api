package co.unicauca.gsrpi_api.system_configuration.application.mapper;

import co.unicauca.gsrpi_api.system_configuration.domain.model.Configuration;
import co.unicauca.gsrpi_api.system_configuration.domain.model.Faculty;
import co.unicauca.gsrpi_api.system_configuration.domain.model.dto.request.ConfigurationRequest;
import co.unicauca.gsrpi_api.system_configuration.domain.model.dto.response.ConfigurationResponse;
import co.unicauca.gsrpi_api.system_configuration.domain.model.dto.response.ConfigurationResponseGetById;
import co.unicauca.gsrpi_api.system_configuration.domain.model.dto.response.FacultyResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SystemConfigurationMapper {
    List<FacultyResponse> facultyListToFacultyResponseList(List<Faculty> faculties);
    Configuration configurationRequestToConfiguration(ConfigurationRequest configurationRequest);
    ConfigurationResponse configurationToConfigurationResponse(Configuration configuration);
    ConfigurationResponseGetById configurationToConfigurationResponseGetById(Configuration configuration);
}
