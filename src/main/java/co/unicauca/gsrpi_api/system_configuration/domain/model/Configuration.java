package co.unicauca.gsrpi_api.system_configuration.domain.model;

public class Configuration {
    private long configurationId;
    private Faculty faculty;

    public Configuration() { }

    public Configuration(Faculty faculty) {
        this.faculty = faculty;
    }

    public Configuration(long configurationId, Faculty faculty) {
        this.configurationId = configurationId;
        this.faculty = faculty;
    }

    public long getConfigurationId() {
        return configurationId;
    }

    public void setConfigurationId(long configurationId) {
        this.configurationId = configurationId;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }
}
