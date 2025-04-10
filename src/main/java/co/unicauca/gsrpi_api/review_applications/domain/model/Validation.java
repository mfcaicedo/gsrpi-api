package co.unicauca.gsrpi_api.review_applications.domain.model;

import co.unicauca.gsrpi_api.applications.domain.model.Application;
import co.unicauca.gsrpi_api.user_management.domain.model.Person;

import java.time.LocalDateTime;

public class Validation {
    private long validationId;
    private Boolean validationState;
    private String observations;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
    //Relacion muchos a uno con la tabla application
    private Application application;
    //Relacion de muchos a uno con la tabla validationType
    private ValidationType validationType;
    //Relacion de muchos a uno con la tabla person
    private Person person;

    public Validation() {
    }

    public Validation(long validationId, Boolean validationState, String observations, LocalDateTime createAt, LocalDateTime updateAt, Application application, ValidationType validationType, Person person) {
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

    public Application getApplication() {
        return application;
    }

    public void setApplication(Application application) {
        this.application = application;
    }

    public ValidationType getValidationType() {
        return validationType;
    }

    public void setValidationType(ValidationType validationType) {
        this.validationType = validationType;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
