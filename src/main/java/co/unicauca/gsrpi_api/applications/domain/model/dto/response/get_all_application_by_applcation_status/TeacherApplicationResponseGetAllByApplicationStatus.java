package co.unicauca.gsrpi_api.applications.domain.model.dto.response.get_all_application_by_applcation_status;

import co.unicauca.gsrpi_api.review_applications.domain.model.dto.response.TeacherResponseGetAllByFacultyId;

public class TeacherApplicationResponseGetAllByApplicationStatus {
    private Long teacherApplicationId;
    private String typeOfRequestingTeacher; //Valores de primario y secundario
    //Relacion many to one con docente
    private TeacherResponseGetAllByApplicationStatus teacher;

    public TeacherApplicationResponseGetAllByApplicationStatus() {
    }

    public TeacherApplicationResponseGetAllByApplicationStatus(Long teacherApplicationId, String typeOfRequestingTeacher, TeacherResponseGetAllByApplicationStatus teacher) {
        this.teacherApplicationId = teacherApplicationId;
        this.typeOfRequestingTeacher = typeOfRequestingTeacher;
        this.teacher = teacher;
    }

    public Long getTeacherApplicationId() {
        return teacherApplicationId;
    }

    public void setTeacherApplicationId(Long teacherApplicationId) {
        this.teacherApplicationId = teacherApplicationId;
    }

    public String getTypeOfRequestingTeacher() {
        return typeOfRequestingTeacher;
    }

    public void setTypeOfRequestingTeacher(String typeOfRequestingTeacher) {
        this.typeOfRequestingTeacher = typeOfRequestingTeacher;
    }

    public TeacherResponseGetAllByApplicationStatus getTeacher() {
        return teacher;
    }

    public void setTeacher(TeacherResponseGetAllByApplicationStatus teacher) {
        this.teacher = teacher;
    }
}
