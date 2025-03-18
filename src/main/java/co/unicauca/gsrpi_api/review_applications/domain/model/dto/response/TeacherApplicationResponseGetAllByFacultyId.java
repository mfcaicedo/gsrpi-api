package co.unicauca.gsrpi_api.review_applications.domain.model.dto.response;

public class TeacherApplicationResponseGetAllByFacultyId {
    private Long teacherApplicationId;
    private String typeOfRequestingTeacher; //Valores de primario y secundario
    //Relacion many to one con docente
    private TeacherResponseGetAllByFacultyId teacher;

    public TeacherApplicationResponseGetAllByFacultyId() {
    }

    public TeacherApplicationResponseGetAllByFacultyId(Long teacherApplicationId, String typeOfRequestingTeacher, TeacherResponseGetAllByFacultyId teacher) {
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

    public TeacherResponseGetAllByFacultyId getTeacher() {
        return teacher;
    }

    public void setTeacher(TeacherResponseGetAllByFacultyId teacher) {
        this.teacher = teacher;
    }
}
