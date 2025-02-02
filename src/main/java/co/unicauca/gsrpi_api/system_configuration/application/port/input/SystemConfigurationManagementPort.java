package co.unicauca.gsrpi_api.system_configuration.application.port.input;

import co.unicauca.gsrpi_api.system_configuration.domain.model.dto.response.ConfigurationResponseGetById;

public interface SystemConfigurationManagementPort {
    ConfigurationResponseGetById getConfigurationById(long configurationId);
}
