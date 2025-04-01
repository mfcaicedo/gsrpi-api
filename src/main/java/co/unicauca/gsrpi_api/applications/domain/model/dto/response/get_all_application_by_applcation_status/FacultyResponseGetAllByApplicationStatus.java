package co.unicauca.gsrpi_api.applications.domain.model.dto.response.get_all_application_by_applcation_status;

public class FacultyResponseGetAllByApplicationStatus {
    private long facultyId;
    private String name;

    public FacultyResponseGetAllByApplicationStatus() {
    }

    public FacultyResponseGetAllByApplicationStatus(long facultyId, String name) {
        this.facultyId = facultyId;
        this.name = name;
    }

    public long getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(long facultyId) {
        this.facultyId = facultyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
