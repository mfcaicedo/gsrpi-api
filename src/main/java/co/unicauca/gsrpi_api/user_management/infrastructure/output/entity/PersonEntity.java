package co.unicauca.gsrpi_api.user_management.infrastructure.output.entity;

import co.unicauca.gsrpi_api.auth.infrastructure.output.entity.UserEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "persona")
public class PersonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "persona_id")
    private Long personId;
    @Column(name = "primer_nombre", columnDefinition = "TEXT", nullable = false)
    private String firstName;
    @Column(name = "segundo_nombre", columnDefinition = "TEXT")
    private String secondName;
    @Column(name = "primer_apellido", columnDefinition = "TEXT", nullable = false)
    private String firstLastName;
    @Column(name = "segundo_apellido", columnDefinition = "TEXT")
    private String secondLastName;
    @Column(name = "tipo_identificacion_cat_id", nullable = false)
    private Long identificationTypeCatId;
    @Column(name = "numero_identificacion",columnDefinition = "BIGINT",nullable = false, unique = true)
    private String identificationNumber;
    @Size(max = 10, min = 10)
    @Column(name = "telefono", nullable = true, length = 10)
    private String phone;
    @Column(name = "correo_institucional",columnDefinition = "TEXT",nullable = false, unique = true)
    private String email;
    @Column(name = "direccion",columnDefinition = "TEXT")
    private String address;

    //Relacion debil con la tabla configuracion
    @Column(name = "configuracion_id")
    private Long configurationId;

    //Relacion many to one con la tabla usuario
    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private UserEntity user;

    public PersonEntity() {
    }

    public PersonEntity(String firstName, String secondName, String firstLastName, String secondLastName, Long identificationTypeCatId, String identificationNumber, String phone, String email, String address, Long configurationId, UserEntity user) {
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

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
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

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }
}
