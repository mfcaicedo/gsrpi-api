package co.unicauca.gsrpi_api.review_applications.domain.model.dto.response;

public class PersonResponseGetAllByFacultyId {
    private Long personId;
    private String firstName;
    private String secondName;
    private String firstLastName;
    private String secondLastName;

    public PersonResponseGetAllByFacultyId() {
    }

    public PersonResponseGetAllByFacultyId(Long personId, String firstName, String secondName, String firstLastName, String secondLastName) {
        this.personId = personId;
        this.firstName = firstName;
        this.secondName = secondName;
        this.firstLastName = firstLastName;
        this.secondLastName = secondLastName;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFirstLastName() {
        return firstLastName;
    }

    public void setFirstLastName(String firstLastName) {
        this.firstLastName = firstLastName;
    }

    public String getSecondLastName() {
        return secondLastName;
    }

    public void setSecondLastName(String secondLastName) {
        this.secondLastName = secondLastName;
    }
}
