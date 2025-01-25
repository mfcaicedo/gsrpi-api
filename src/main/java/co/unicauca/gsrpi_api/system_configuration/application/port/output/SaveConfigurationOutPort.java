package co.unicauca.gsrpi_api.system_configuration.application.port.output;

import co.unicauca.gsrpi_api.system_configuration.domain.model.Configuration;
import co.unicauca.gsrpi_api.system_configuration.domain.model.dto.request.ConfigurationRequest;

public interface SaveConfigurationOutPort {
    Configuration saveConfiguration(Configuration configuration);
}
