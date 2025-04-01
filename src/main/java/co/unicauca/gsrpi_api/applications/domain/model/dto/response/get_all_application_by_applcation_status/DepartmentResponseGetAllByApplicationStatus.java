package co.unicauca.gsrpi_api.applications.domain.model.dto.response.get_all_application_by_applcation_status;

public class DepartmentResponseGetAllByApplicationStatus {
    private long departmentId;
    private String name;
    private FacultyResponseGetAllByApplicationStatus faculty;

    public DepartmentResponseGetAllByApplicationStatus() {
    }

    public DepartmentResponseGetAllByApplicationStatus(long departmentId, String name, FacultyResponseGetAllByApplicationStatus faculty) {
        this.departmentId = departmentId;
        this.name = name;
        this.faculty = faculty;
    }

    public long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(long departmentId) {
        this.departmentId = departmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FacultyResponseGetAllByApplicationStatus getFaculty() {
        return faculty;
    }

    public void setFaculty(FacultyResponseGetAllByApplicationStatus faculty) {
        this.faculty = faculty;
    }
}
