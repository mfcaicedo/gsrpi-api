package co.unicauca.gsrpi_api.system_configuration.domain.model.dto.request;

public class ConfigurationRequest {
    private FacultyRequest faculty;

    public ConfigurationRequest() {
    }

    public ConfigurationRequest(FacultyRequest faculty) {
        this.faculty = faculty;
    }

    public FacultyRequest getFaculty() {
        return faculty;
    }

    public void setFaculty(FacultyRequest faculty) {
        this.faculty = faculty;
    }
}
