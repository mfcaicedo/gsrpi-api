package co.unicauca.gsrpi_api.system_configuration.application.usecase;

import co.unicauca.gsrpi_api.system_configuration.application.mapper.SystemConfigurationMapper;
import co.unicauca.gsrpi_api.system_configuration.application.port.input.SystemConfigurationManagementPort;
import co.unicauca.gsrpi_api.system_configuration.application.port.output.SystemConfigurationManagementOutPort;
import co.unicauca.gsrpi_api.system_configuration.domain.model.dto.response.ConfigurationResponseGetById;

public class SystemConfigurationManagementUseCase implements SystemConfigurationManagementPort {
    private final SystemConfigurationManagementOutPort systemConfigurationManagementOutPort;
    private final SystemConfigurationMapper systemConfigurationMapper;

    public SystemConfigurationManagementUseCase(SystemConfigurationManagementOutPort systemConfigurationManagementOutPort,
                                                SystemConfigurationMapper systemConfigurationMapper
    ) {
        this.systemConfigurationManagementOutPort = systemConfigurationManagementOutPort;
        this.systemConfigurationMapper = systemConfigurationMapper;
    }

    @Override
    public ConfigurationResponseGetById getConfigurationById(long configurationId) {
        return this.systemConfigurationMapper.configurationToConfigurationResponseGetById(
                this.systemConfigurationManagementOutPort.getConfigurationById(configurationId)
        );
    }
}
