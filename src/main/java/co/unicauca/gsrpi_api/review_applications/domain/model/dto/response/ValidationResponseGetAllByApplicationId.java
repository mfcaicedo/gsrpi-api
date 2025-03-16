package co.unicauca.gsrpi_api.review_applications.domain.model.dto.response;

import co.unicauca.gsrpi_api.applications.domain.model.Application;
import co.unicauca.gsrpi_api.review_applications.domain.model.ValidationType;
import co.unicauca.gsrpi_api.user_management.domain.model.Person;

public class ValidationResponseGetAllByApplicationId {
    private long validationId;
    private Boolean validationState;
    private String observations;
    //Relacion de muchos a uno con la tabla validationType
    private ValidationType validationType;
    //Relacion de muchos a uno con la tabla person
    private PersonResponseGetAllByApplicationId person;

    public ValidationResponseGetAllByApplicationId() {
    }

    public ValidationResponseGetAllByApplicationId(long validationId, Boolean validationState, String observations, ValidationType validationType, PersonResponseGetAllByApplicationId person) {
        this.validationId = validationId;
        this.validationState = validationState;
        this.observations = observations;
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
