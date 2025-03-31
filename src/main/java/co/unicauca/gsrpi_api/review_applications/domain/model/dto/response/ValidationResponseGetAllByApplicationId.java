package co.unicauca.gsrpi_api.review_applications.domain.model.dto.response;

import co.unicauca.gsrpi_api.applications.domain.model.Application;
import co.unicauca.gsrpi_api.review_applications.domain.model.ValidationType;
import co.unicauca.gsrpi_api.user_management.domain.model.Person;

import java.time.LocalDateTime;

public class ValidationResponseGetAllByApplicationId {
    private long validationId;
    private Boolean validationState;
    private String observations;
    private LocalDateTime  createAt;
    private LocalDateTime updateAt;
    //Relacion de muchos a uno con la tabla validationType
    private ValidationType validationType;
    //Relacion de muchos a uno con la tabla person
    private PersonResponseGetAllByApplicationId person;

    public ValidationResponseGetAllByApplicationId() {
    }

    public ValidationResponseGetAllByApplicationId(long validationId, Boolean validationState, String observations, LocalDateTime createAt, LocalDateTime updateAt, ValidationType validationType, PersonResponseGetAllByApplicationId person) {
        this.validationId = validationId;
        this.validationState = validationState;
        this.observations = observations;
        this.createAt = createAt;
        this.updateAt = updateAt;
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

    public ValidationType getValidationType() {
        return validationType;
    }

    public void setValidationType(ValidationType validationType) {
        this.validationType = validationType;
    }

    public PersonResponseGetAllByApplicationId getPerson() {
        return person;
    }

    public void setPerson(PersonResponseGetAllByApplicationId person) {
        this.person = person;
    }
}
