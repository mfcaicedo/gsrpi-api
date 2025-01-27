package co.unicauca.gsrpi_api.applications.infrastructure.output.entity;

import co.unicauca.gsrpi_api.user_management.infrastructure.output.entity.PersonEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "docente")
public class TeacherEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "docente_id")
    private Long teacherId;
    @Column(name = "estado", columnDefinition = "TEXT", nullable = true)
    private String state;
    @Column(name = "tipo_vinculacion", columnDefinition = "TEXT", nullable = false)
    private String typeOfLinkage;
    //Relacion debil con departamento
    @Column(name = "departamento_id", nullable = false)
    private long departmentId;
    //Relacion one to one con persona
    @OneToOne
    @JoinColumn(name = "persona_id", nullable = false)
    private PersonEntity person;

    public TeacherEntity() {
    }

    public TeacherEntity(Long teacherId, String state, String typeOfLinkage, long departmentId, PersonEntity person) {
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

    public PersonEntity getPerson() {
        return person;
    }

    public void setPerson(PersonEntity person) {
        this.person = person;
    }
}
