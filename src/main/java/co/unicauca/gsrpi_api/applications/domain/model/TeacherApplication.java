package co.unicauca.gsrpi_api.applications.domain.model;

import co.unicauca.gsrpi_api.applications.infrastructure.output.entity.ApplicationEntity;
import co.unicauca.gsrpi_api.applications.infrastructure.output.entity.TeacherEntity;

public class TeacherApplication {
    private Long teacherApplicationId;
    private String typeOfRequestingTeacher; //Valores de primario y secundario
    private Double recommendedPoints;
    private Double assignedPoints;
    //Relacion many to one con docente
    private TeacherEntity teacher;
    //Relacion many to one con solicitud
    private ApplicationEntity application;

    public TeacherApplication() {
    }

    public TeacherApplication(Long teacherApplicationId, String typeOfRequestingTeacher, Double recommendedPoints, Double assignedPoints, TeacherEntity teacher, ApplicationEntity application) {
        this.teacherApplicationId = teacherApplicationId;
        this.typeOfRequestingTeacher = typeOfRequestingTeacher;
        this.recommendedPoints = recommendedPoints;
        this.assignedPoints = assignedPoints;
        this.teacher = teacher;
        this.application = application;
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

    public Double getRecommendedPoints() {
        return recommendedPoints;
    }

    public void setRecommendedPoints(Double recommendedPoints) {
        this.recommendedPoints = recommendedPoints;
    }

    public Double getAssignedPoints() {
        return assignedPoints;
    }

    public void setAssignedPoints(Double assignedPoints) {
        this.assignedPoints = assignedPoints;
    }

    public TeacherEntity getTeacher() {
        return teacher;
    }

    public void setTeacher(TeacherEntity teacher) {
        this.teacher = teacher;
    }

    public ApplicationEntity getApplication() {
        return application;
    }

    public void setApplication(ApplicationEntity application) {
        this.application = application;
    }
}
