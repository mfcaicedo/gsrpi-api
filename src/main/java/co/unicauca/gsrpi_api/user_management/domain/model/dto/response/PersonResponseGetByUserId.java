package co.unicauca.gsrpi_api.user_management.domain.model.dto.response;

import co.unicauca.gsrpi_api.auth.domain.model.User;

public class PersonResponseGetByUserId {
    private Long personId;
    private String firstName;
    private String secondName;
    private String firstLastName;
    private String secondLastName;
    private Long identificationTypeCatId;
    private Long identificationNumber;
    private String phone;
    private String email;
    private String address;
    //Relacion debil con la tabla configuracion
    private Long configurationId;

    public PersonResponseGetByUserId() {
    }

    public PersonResponseGetByUserId(Long personId, String firstName, String secondName, String firstLastName, String secondLastName, Long identificationTypeCatId, Long identificationNumber, String phone, String email, String address, Long configurationId) {
        this.personId = personId;
        this.firstName = firstName;
        this.secondName = secondName;
        this.firstLastName = firstLastName;
        this.secondLastName = secondLastName;
        this.identificationTypeCatId = identificationTypeCatId;
        this.identificationNumber = identificationNumber;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.configurationId = configurationId;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getConfigurationId() {
        return configurationId;
    }

    public void setConfigurationId(Long configurationId) {
        this.configurationId = configurationId;
    }
}
