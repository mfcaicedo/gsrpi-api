package co.unicauca.gsrpi_api.system_configuration.application.usecase;

import co.unicauca.gsrpi_api.system_configuration.application.mapper.SystemConfigurationMapper;
import co.unicauca.gsrpi_api.system_configuration.application.port.input.SaveConfigurationPort;
import co.unicauca.gsrpi_api.system_configuration.application.port.output.SaveConfigurationOutPort;
import co.unicauca.gsrpi_api.system_configuration.domain.model.dto.request.ConfigurationRequest;
import co.unicauca.gsrpi_api.system_configuration.domain.model.dto.response.ConfigurationResponse;

public class SaveConfigurationUseCase implements SaveConfigurationPort {

    private final SaveConfigurationOutPort saveConfigurationOutPort;
    private final SystemConfigurationMapper mapper;

    public SaveConfigurationUseCase(SaveConfigurationOutPort saveConfigurationOutPort,
                                    SystemConfigurationMapper mapper) {
        this.saveConfigurationOutPort = saveConfigurationOutPort;
        this.mapper = mapper;
    }

    @Override
    public ConfigurationResponse saveConfiguration(ConfigurationRequest configurationRequest) {
        return this.mapper.configurationToConfigurationResponse(
                this.saveConfigurationOutPort.saveConfiguration(
                        this.mapper.configurationRequestToConfiguration(configurationRequest)));

    }
}
