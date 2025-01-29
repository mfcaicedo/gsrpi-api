package co.unicauca.gsrpi_api.applications.domain.model;

import co.unicauca.gsrpi_api.user_management.domain.model.Person;

public class Teacher {
    private Long teacherId;
    private String state;
    private String typeOfLinkage;
    //Relacion debil con departamento
    private long departmentId;
    //Relacion one to one con persona
    private Person person;

    public Teacher() {
    }

    public Teacher(Long teacherId, String state, String typeOfLinkage, long departmentId, Person person) {
        this.teacherId = teacherId;
        this.state = state;
        this.typeOfLinkage = typeOfLinkage;
        this.departmentId = departmentId;
        this.person = person;
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

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
