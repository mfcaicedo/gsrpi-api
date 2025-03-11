package co.unicauca.gsrpi_api.review_applications.domain.model;

import co.unicauca.gsrpi_api.applications.domain.model.Application;
import co.unicauca.gsrpi_api.user_management.domain.model.Person;

public class Validation {
    private long validationId;
    private String validationState;
    private String observations;
    //Relacion muchos a uno con la tabla application
    private Application application;
    //Relacion de muchos a uno con la tabla validationType
    private ValidationType validationType;
    //Relacion de muchos a uno con la tabla person
    private Person person;

    public Validation() {
    }

    public Validation(long validationId, String validationState, String observations, Application application, ValidationType validationType, Person person) {
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

    public String getValidationState() {
        return validationState;
    }

    public void setValidationState(String validationState) {
        this.validationState = validationState;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
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
