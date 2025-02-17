package co.unicauca.gsrpi_api.review_applications.domain.model.dto.response;

public class DepartmentResponseGetAllByFactultyId {
    private long departmentId;
    private String name;

    public DepartmentResponseGetAllByFactultyId() {
    }

    public DepartmentResponseGetAllByFactultyId(long departmentId, String name) {
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
