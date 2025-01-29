package co.unicauca.gsrpi_api.applications.domain.model.dto.request;

import co.unicauca.gsrpi_api.user_management.domain.model.Person;

public class TeacherRequest {
    private Long teacherId;
    private String state;
    private String typeOfLinkage;
    //Relacion debil con departamento
    private long departmentId;

    public TeacherRequest() {
    }

    public TeacherRequest(Long teacherId, String state, String typeOfLinkage, long departmentId) {
        this.teacherId = teacherId;
        this.state = state;
        this.typeOfLinkage = typeOfLinkage;
        this.departmentId = departmentId;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getTypeOfLinkage() {
        return typeOfLinkage;
    }

    public void setTypeOfLinkage(String typeOfLinkage) {
        this.typeOfLinkage = typeOfLinkage;
    }

    public long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(long departmentId) {
        this.departmentId = departmentId;
    }
}
