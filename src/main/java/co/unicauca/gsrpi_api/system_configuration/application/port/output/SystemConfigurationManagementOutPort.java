package co.unicauca.gsrpi_api.system_configuration.application.port.output;

import co.unicauca.gsrpi_api.system_configuration.domain.model.Configuration;

public interface SystemConfigurationManagementOutPort {
    Configuration getConfigurationById(long configurationId);
}
