package co.unicauca.gsrpi_api.system_configuration.infrastructure.output.adapter;

import co.unicauca.gsrpi_api.system_configuration.application.port.output.SaveConfigurationOutPort;
import co.unicauca.gsrpi_api.system_configuration.domain.model.Configuration;
import co.unicauca.gsrpi_api.system_configuration.infrastructure.output.entity.FacultyEntity;
import co.unicauca.gsrpi_api.system_configuration.infrastructure.output.mapper.MapStructConfigurationMapper;
import co.unicauca.gsrpi_api.system_configuration.infrastructure.output.repository.ConfigurationRepository;
import co.unicauca.gsrpi_api.system_configuration.infrastructure.output.repository.FacultyRepository;
import org.springframework.stereotype.Service;

@Service
public class SaveConfigurationAdapter implements SaveConfigurationOutPort {

    private final ConfigurationRepository configurationRepository;
    private final FacultyRepository facultyRepository;
    private final MapStructConfigurationMapper mapStructConfigurationMapper;

    public SaveConfigurationAdapter(
            ConfigurationRepository configurationRepository,
            FacultyRepository facultyRepository,
            MapStructConfigurationMapper mapStructConfigurationMapper
    ) {
        this.configurationRepository = configurationRepository;
        this.facultyRepository = facultyRepository;
        this.mapStructConfigurationMapper = mapStructConfigurationMapper;
    }

    @Override
    public Configuration saveConfiguration(Configuration configuration) {
        //Consulto la facultad en la base de datos por id
        FacultyEntity facultyEntity = this.facultyRepository.findById(configuration.getFaculty().getFacultyId()).orElseThrow(() -> new RuntimeException("Faculty not found"));
        configuration.setFaculty(this.mapStructConfigurationMapper.facultyEntityToFaculty(facultyEntity));
        return this.mapStructConfigurationMapper.configurationEntityToConfiguration(
                this.configurationRepository.save(this.mapStructConfigurationMapper.configurationToConfigurationEntity(configuration)));
    }
}
