package co.unicauca.gsrpi_api.review_applications.domain.model.dto.response;

import co.unicauca.gsrpi_api.user_management.domain.model.Person;

public class TeacherResponseGetAllByFacultyId {
    private Long teacherId;
    //Relacion one to one con persona
    private PersonResponseGetAllByFacultyId person;

    public TeacherResponseGetAllByFacultyId() {
    }

    public TeacherResponseGetAllByFacultyId(Long teacherId, PersonResponseGetAllByFacultyId person) {
        this.teacherId = teacherId;
        this.person = person;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public PersonResponseGetAllByFacultyId getPerson() {
        return person;
    }

    public void setPerson(PersonResponseGetAllByFacultyId person) {
        this.person = person;
    }
}
