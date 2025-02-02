package co.unicauca.gsrpi_api.system_configuration.infrastructure.output.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import java.util.List;

@Entity
@Table(name = "facultad")
public class FacultyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "facultad_id")
    private long facultyId;
    @Column(name = "nombre", columnDefinition = "TEXT", nullable = false)
    private String name;
    @Column(name = "ubicacion", columnDefinition = "TEXT", nullable = true)
    private String location;
    @Size(max = 10, min = 10)
    @Column(name = "telefono", nullable = true, length = 10)
    private String phone;
    @Column(name = "correo",columnDefinition = "TEXT", nullable = true)
    private String email;
    @Column(name = "direccion",columnDefinition = "TEXT", nullable = true)
    private String address;
    @Column(name = "abreviatura", columnDefinition = "TEXT", nullable = true)
    private String abbreviation;

    //Relacion uno a muchos con Departamento (Habilitar solo si necesito que al consultar la facultar me traiga los departamentos)
//    @OneToMany(mappedBy = "faculty")
//    private List<DepartmentEntity> departments;

    //Relacion uno a uno con Configuracion (Habilitar solo si necesito que al consultar la facultad me traiga la configuracion)
//    @OneToOne(mappedBy = "faculty")
//    private ConfigurationEntity configuration;

    public FacultyEntity() {
    }

    public FacultyEntity(String name, String location, String phone, String email, String address) {
        this.name = name;
        this.location = location;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public FacultyEntity(long facultyId, String name, String location, String phone, String email, String address, String abbreviation) {
        this.facultyId = facultyId;
        this.name = name;
        this.location = location;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.abbreviation = abbreviation;
    }

    public long getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(long facultyId) {
        this.facultyId = facultyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }
}
