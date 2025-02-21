package co.unicauca.gsrpi_api.applications.domain.model.dto.response.get_application_by_id;

public class TeacherApplicationGetById {
    private Long teacherApplicationId;
    private String typeOfRequestingTeacher; //Valores de primario y secundario
    //Relacion many to one con docente
    private TeacherResponseGetById teacher;

    public TeacherApplicationGetById() {
    }

    public TeacherApplicationGetById(Long teacherApplicationId, String typeOfRequestingTeacher, TeacherResponseGetById teacher) {
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

    public TeacherResponseGetById getTeacher() {
        return teacher;
    }

    public void setTeacher(TeacherResponseGetById teacher) {
        this.teacher = teacher;
    }
}
