package co.unicauca.gsrpi_api.system_configuration.infrastructure.output.adapter;

import co.unicauca.gsrpi_api.system_configuration.application.port.output.SystemConfigurationManagementOutPort;
import co.unicauca.gsrpi_api.system_configuration.domain.model.Configuration;
import co.unicauca.gsrpi_api.system_configuration.infrastructure.output.mapper.MapStructConfigurationMapper;
import co.unicauca.gsrpi_api.system_configuration.infrastructure.output.repository.ConfigurationRepository;
import org.springframework.stereotype.Service;

@Service
public class SystemConfigurationManagementAdapter implements SystemConfigurationManagementOutPort {
    private final ConfigurationRepository configurationRepository;
    private final MapStructConfigurationMapper mapStructConfigurationMapper;

    public SystemConfigurationManagementAdapter(ConfigurationRepository configurationRepository,
                                                MapStructConfigurationMapper mapStructConfigurationMapper) {
        this.configurationRepository = configurationRepository;
        this.mapStructConfigurationMapper = mapStructConfigurationMapper;
    }

    @Override
    public Configuration getConfigurationById(long configurationId) {
        return this.mapStructConfigurationMapper.configurationEntityToConfiguration(
                this.configurationRepository.findById(configurationId).orElseThrow(() -> new RuntimeException("Configuration not found"))
        );
    }
}
