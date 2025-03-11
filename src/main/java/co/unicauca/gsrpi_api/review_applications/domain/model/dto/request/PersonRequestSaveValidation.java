package co.unicauca.gsrpi_api.review_applications.domain.model.dto.request;

public class PersonRequestSaveValidation {
    private long personId;

    public PersonRequestSaveValidation() {
    }

    public PersonRequestSaveValidation(long personId) {
        this.personId = personId;
    }

    public long getPersonId() {
        return personId;
    }

    public void setPersonId(long personId) {
        this.personId = personId;
    }
}
