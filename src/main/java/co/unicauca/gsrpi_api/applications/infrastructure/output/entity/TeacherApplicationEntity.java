package co.unicauca.gsrpi_api.applications.infrastructure.output.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "docente_solicitud")
public class TeacherApplicationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "docente_solicitud_id")
    private Long teacherApplicationId;
    @Column(name = "tipo_docente_solicitante",columnDefinition = "TEXT", nullable = false)
    private String typeOfRequestingTeacher; //Valores de primario y secundario
    @Column(name = "puntos_recomendados", columnDefinition = "SMALLINT", nullable = true)
    private short recommendedPoints;
    @Column(name = "puntos_asignados", columnDefinition = "SMALLINT", nullable = true)
    private short assignedPoints;
    //Relacion many to one con docente
    @ManyToOne
    @JoinColumn(name = "docente_id", nullable = false)
    private TeacherEntity teacher;
    //Relacion many to one con solicitud
    @ManyToOne
    @JoinColumn(name = "solicitud_id", nullable = false)
    private ApplicationEntity application;

    public TeacherApplicationEntity() {
    }

    public TeacherApplicationEntity(Long teacherApplicationId, String typeOfRequestingTeacher, short recommendedPoints, short assignedPoints, TeacherEntity teacher, ApplicationEntity application) {
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

    public short getRecommendedPoints() {
        return recommendedPoints;
    }

    public void setRecommendedPoints(short recommendedPoints) {
        this.recommendedPoints = recommendedPoints;
    }

    public short getAssignedPoints() {
        return assignedPoints;
    }

    public void setAssignedPoints(short assignedPoints) {
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
