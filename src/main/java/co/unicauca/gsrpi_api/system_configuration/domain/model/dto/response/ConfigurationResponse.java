package co.unicauca.gsrpi_api.system_configuration.domain.model.dto.response;

public class ConfigurationResponse {
    private long configurationId;

    public ConfigurationResponse() {
    }

    public ConfigurationResponse(long configurationId) {
        this.configurationId = configurationId;
    }

    public long getConfigurationId() {
        return configurationId;
    }

    public void setConfigurationId(long configurationId) {
        this.configurationId = configurationId;
    }
}
