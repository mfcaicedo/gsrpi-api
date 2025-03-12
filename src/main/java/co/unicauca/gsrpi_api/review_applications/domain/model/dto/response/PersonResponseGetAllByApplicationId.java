package co.unicauca.gsrpi_api.review_applications.domain.model.dto.response;

import co.unicauca.gsrpi_api.auth.domain.model.User;

public class PersonResponseGetAllByApplicationId {
    private Long personId;
    private String firstName;
    private String secondName;
    private String firstLastName;
    private String secondLastName;
    private Long identificationTypeCatId;
    private Long identificationNumber;
    private String email;
    //Relacion debil con la tabla configuracion
    private Long configurationId;
    //Relacion many to one con la tabla usuario
    private UserResponseGetAllByApplicationId user;

    public PersonResponseGetAllByApplicationId() {
    }

    public PersonResponseGetAllByApplicationId(Long personId, String firstName, String secondName, String firstLastName, String secondLastName, Long identificationTypeCatId, Long identificationNumber, String email, Long configurationId, UserResponseGetAllByApplicationId user) {
        this.personId = personId;
        this.firstName = firstName;
        this.secondName = secondName;
        this.firstLastName = firstLastName;
        this.secondLastName = secondLastName;
        this.identificationTypeCatId = identificationTypeCatId;
        this.identificationNumber = identificationNumber;
        this.email = email;
        this.configurationId = configurationId;
        this.user = user;
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

    public Long getIdentificationTypeCatId() {
        return identificationTypeCatId;
    }

    public void setIdentificationTypeCatId(Long identificationTypeCatId) {
        this.identificationTypeCatId = identificationTypeCatId;
    }

    public Long getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(Long identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getConfigurationId() {
        return configurationId;
    }

    public void setConfigurationId(Long configurationId) {
        this.configurationId = configurationId;
    }

    public UserResponseGetAllByApplicationId getUser() {
        return user;
    }

    public void setUser(UserResponseGetAllByApplicationId user) {
        this.user = user;
    }
}

