package co.unicauca.gsrpi_api.applications.domain.model.dto.response.get_application_by_id;

import co.unicauca.gsrpi_api.user_management.domain.model.Person;

public class TeacherResponseGetById {
    private Long teacherId;
    private String typeOfLinkage;
    //Relacion debil con departamento
    private long departmentId;
    //Relacion one to one con persona
    private PersonResponseGetById person;

    public TeacherResponseGetById() {
    }

    public TeacherResponseGetById(Long teacherId, String typeOfLinkage, long departmentId, PersonResponseGetById person) {
        this.teacherId = teacherId;
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

    public PersonResponseGetById getPerson() {
        return person;
    }

    public void setPerson(PersonResponseGetById person) {
        this.person = person;
    }
}
