package co.unicauca.gsrpi_api.system_configuration.domain.model.dto.request;

public class ConfigurationRequest {
    private long configurationId;
    private FacultyRequest faculty;

    public ConfigurationRequest() {
    }

    public ConfigurationRequest(long configurationId,FacultyRequest faculty) {
        this.configurationId = configurationId;
        this.faculty = faculty;
    }

    public FacultyRequest getFaculty() {
        return faculty;
    }

    public void setFaculty(FacultyRequest faculty) {
        this.faculty = faculty;
    }

    public long getConfigurationId() {
        return configurationId;
    }

    public void setConfigurationId(long configurationId) {
        this.configurationId = configurationId;
    }
}
