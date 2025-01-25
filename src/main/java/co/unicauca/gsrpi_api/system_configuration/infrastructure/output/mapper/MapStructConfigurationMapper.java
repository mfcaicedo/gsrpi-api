package co.unicauca.gsrpi_api.system_configuration.infrastructure.output.mapper;

import co.unicauca.gsrpi_api.system_configuration.domain.model.Configuration;
import co.unicauca.gsrpi_api.system_configuration.domain.model.Faculty;
import co.unicauca.gsrpi_api.system_configuration.infrastructure.output.entity.ConfigurationEntity;
import co.unicauca.gsrpi_api.system_configuration.infrastructure.output.entity.FacultyEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MapStructConfigurationMapper {

    List<Configuration> configurationEntityListToConfigurationList(List<ConfigurationEntity> configurationEntityList);

    Configuration configurationEntityToConfiguration(ConfigurationEntity configurationEntity);

    List<Faculty> facultyEntityListToFacultyList(List<FacultyEntity> facultyEntityList);

    ConfigurationEntity configurationToConfigurationEntity(Configuration configuration);
}
