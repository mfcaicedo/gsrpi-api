package co.unicauca.gsrpi_api.user_management.domain.model.dto.response;

public class PersonResponse {
    private long personId;

    public PersonResponse() {
    }

    public PersonResponse(long personId) {
        this.personId = personId;
    }

    public long getPersonId() {
        return personId;
    }

    public void setPersonId(long personId) {
        this.personId = personId;
    }
}
