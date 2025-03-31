package co.unicauca.gsrpi_api.review_applications.infrastructure.output.entity;

import co.unicauca.gsrpi_api.applications.infrastructure.output.entity.ApplicationEntity;
import co.unicauca.gsrpi_api.user_management.infrastructure.output.entity.PersonEntity;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "validacion")
public class ValidationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "validacion_id")
    private long validationId;
    @Column(name = "estado_validacion", columnDefinition = "BOOLEAN", nullable = false)
    private Boolean validationState;
    @Column(name = "observaciones", columnDefinition = "TEXT")
    private String observations;
    @Column(name = "fecha_creacion", columnDefinition = "TIMESTAMPTZ", nullable = false)
    private LocalDateTime createAt;
    @Column(name = "fecha_actualizacion", columnDefinition = "TIMESTAMPTZ", nullable = true)
    private LocalDateTime updateAt;
    //Relacion muchos a uno con la tabla application
    @ManyToOne
    @JoinColumn(name = "solicitud_id", nullable = false)
    private ApplicationEntity application;
    //Relacion de muchos a uno con la tabla validationType
    @ManyToOne
    @JoinColumn(name = "tipo_validacion_id", nullable = false)
    private ValidationTypeEntity validationType;
    //Relacion de muchos a uno con la tabla person
    @ManyToOne
    @JoinColumn(name = "persona_id", nullable = false)
    private PersonEntity person;

    public ValidationEntity() {
    }

    public ValidationEntity(long validationId, Boolean validationState, String observations, LocalDateTime createAt, LocalDateTime updateAt, ApplicationEntity application, ValidationTypeEntity validationType, PersonEntity person) {
        this.validationId = validationId;
        this.validationState = validationState;
        this.observations = observations;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.application = application;
        this.validationType = validationType;
        this.person = person;
    }

    public long getValidationId() {
        return validationId;
    }

    public void setValidationId(long validationId) {
        this.validationId = validationId;
    }

    public Boolean getValidationState() {
        return validationState;
    }

    public void setValidationState(Boolean validationState) {
        this.validationState = validationState;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }

    public ApplicationEntity getApplication() {
        return application;
    }

    public void setApplication(ApplicationEntity application) {
        this.application = application;
    }

    public ValidationTypeEntity getValidationType() {
        return validationType;
    }

    public void setValidationType(ValidationTypeEntity validationType) {
        this.validationType = validationType;
    }

    public PersonEntity getPerson() {
        return person;
    }

    public void setPerson(PersonEntity person) {
        this.person = person;
    }
}
