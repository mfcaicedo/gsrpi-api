package co.unicauca.gsrpi_api.review_applications.domain.model.dto.request;

public class ValidationRequest {
    private Boolean validationState;
    private String observations;
    //Relacion muchos a uno con la tabla application
    private ApplicationRequestSaveValidation application;
    //Relacion de muchos a uno con la tabla validationType
    private ValidationTypeRequest validationType;
    //Relacion de muchos a uno con la tabla person
    private PersonRequestSaveValidation person;

    public ValidationRequest() {
    }

    public ValidationRequest(Boolean validationState, String observations, ApplicationRequestSaveValidation application, ValidationTypeRequest validationType, PersonRequestSaveValidation person) {
        this.validationState = validationState;
        this.observations = observations;
        this.application = application;
        this.validationType = validationType;
        this.person = person;
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

    public ApplicationRequestSaveValidation getApplication() {
        return application;
    }

    public void setApplication(ApplicationRequestSaveValidation application) {
        this.application = application;
    }

    public ValidationTypeRequest getValidationType() {
        return validationType;
    }

    public void setValidationType(ValidationTypeRequest validationType) {
        this.validationType = validationType;
    }

    public PersonRequestSaveValidation getPerson() {
        return person;
    }

    public void setPerson(PersonRequestSaveValidation person) {
        this.person = person;
    }
}
