package co.unicauca.gsrpi_api.system_configuration.domain.model;

public class Department {
    private long departmentId;
    private String name;
    private String location;
    private Faculty faculty;

    public Department() {}

    public Department(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public Department(long departmentId, String name, String location, Faculty faculty) {
        this.departmentId = departmentId;
        this.name = name;
        this.location = location;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }
}
