package co.unicauca.gsrpi_api.applications.domain.model.dto.response.get_application_by_id;

public class DepartmentResponseGetById {
    private long departmentId;
    private String name;

    public DepartmentResponseGetById() {
    }

    public DepartmentResponseGetById(long departmentId, String name) {
        this.departmentId = departmentId;
        this.name = name;
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
}
