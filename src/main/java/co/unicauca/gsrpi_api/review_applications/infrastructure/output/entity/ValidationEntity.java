package co.unicauca.gsrpi_api.review_applications.infrastructure.output.entity;

import co.unicauca.gsrpi_api.applications.infrastructure.output.entity.ApplicationEntity;
import co.unicauca.gsrpi_api.user_management.infrastructure.output.entity.PersonEntity;
import jakarta.persistence.*;

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

    public ValidationEntity(long validationId, Boolean validationState, String observations, ApplicationEntity application, ValidationTypeEntity validationType, PersonEntity person) {
        this.validationId = validationId;
        this.validationState = validationState;
        this.observations = observations;
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
