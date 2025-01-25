package co.unicauca.gsrpi_api.system_configuration.infrastructure.output.adapter;

import co.unicauca.gsrpi_api.system_configuration.application.port.output.SaveConfigurationOutPort;
import co.unicauca.gsrpi_api.system_configuration.domain.model.Configuration;
import co.unicauca.gsrpi_api.system_configuration.infrastructure.output.mapper.MapStructConfigurationMapper;
import co.unicauca.gsrpi_api.system_configuration.infrastructure.output.repository.ConfigurationRepository;
import org.springframework.stereotype.Service;

@Service
public class SaveConfigurationAdapter implements SaveConfigurationOutPort {

    private final ConfigurationRepository configurationRepository;
    private final MapStructConfigurationMapper mapStructConfigurationMapper;

    public SaveConfigurationAdapter(
            ConfigurationRepository configurationRepository,
            MapStructConfigurationMapper mapStructConfigurationMapper
    ) {
        this.configurationRepository = configurationRepository;
        this.mapStructConfigurationMapper = mapStructConfigurationMapper;
    }

    @Override
    public Configuration saveConfiguration(Configuration configuration) {
        return this.mapStructConfigurationMapper.configurationEntityToConfiguration(
                this.configurationRepository.save(this.mapStructConfigurationMapper.configurationToConfigurationEntity(configuration)));
    }
}
