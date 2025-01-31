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

    public TeacherApplicationEntity(Long teacherApplicationId, String typeOfRequestingTeacher, TeacherEntity teacher, ApplicationEntity application) {
        this.teacherApplicationId = teacherApplicationId;
        this.typeOfRequestingTeacher = typeOfRequestingTeacher;
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
