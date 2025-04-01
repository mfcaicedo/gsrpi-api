package co.unicauca.gsrpi_api.applications.domain.model.dto.response.get_all_application_by_applcation_status;

import co.unicauca.gsrpi_api.review_applications.domain.model.dto.response.PersonResponseGetAllByFacultyId;

public class TeacherResponseGetAllByApplicationStatus {
    private Long teacherId;
    //Relacion one to one con persona
    private PersonResponseGetAllByApplicationStatus person;

    public TeacherResponseGetAllByApplicationStatus() {
    }

    public TeacherResponseGetAllByApplicationStatus(Long teacherId, PersonResponseGetAllByApplicationStatus person) {
        this.teacherId = teacherId;
        this.person = person;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public PersonResponseGetAllByApplicationStatus getPerson() {
        return person;
    }

    public void setPerson(PersonResponseGetAllByApplicationStatus person) {
        this.person = person;
    }
}
