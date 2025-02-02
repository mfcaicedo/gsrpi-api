package co.unicauca.gsrpi_api.system_configuration.domain.model.dto.response;

import co.unicauca.gsrpi_api.system_configuration.domain.model.Faculty;

public class ConfigurationResponseGetById {
    private long configurationId;
    private FacultyResponse faculty;

    public ConfigurationResponseGetById() {
    }
    public ConfigurationResponseGetById(long configurationId, FacultyResponse faculty) {
        this.configurationId = configurationId;
        this.faculty = faculty;
    }

    public long getConfigurationId() {
        return configurationId;
    }

    public void setConfigurationId(long configurationId) {
        this.configurationId = configurationId;
    }

    public FacultyResponse getFaculty() {
        return faculty;
    }

    public void setFaculty(FacultyResponse faculty) {
        this.faculty = faculty;
    }
}
