package co.unicauca.gsrpi_api.system_configuration.application.port.input;

import co.unicauca.gsrpi_api.system_configuration.domain.model.dto.request.ConfigurationRequest;
import co.unicauca.gsrpi_api.system_configuration.domain.model.dto.response.ConfigurationResponse;

public interface SaveConfigurationPort {
    ConfigurationResponse saveConfiguration(ConfigurationRequest configurationRequest);
}
