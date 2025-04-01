package co.unicauca.gsrpi_api.system_configuration.infrastructure.output.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "departamento")
public class DepartmentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "departamento_id")
    private long departmentId;
    @Column(name = "nombre", columnDefinition = "TEXT", nullable = false)
    private String name;
    @Column(name = "ubicacion",columnDefinition = "TEXT", nullable = true)
    private String location;

    @ManyToOne
    @JoinColumn(name = "facultad_id", nullable = false)
    private FacultyEntity faculty;

    public DepartmentEntity() {
    }

    public DepartmentEntity(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public DepartmentEntity(long departmentId, String name, String location, FacultyEntity faculty) {
        this.departmentId = departmentId;
        this.name = name;
        this.location = location;
        this.faculty = faculty;
    }

    public long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(long departmentId) {
        this.departmentId = departmentId;
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

    public FacultyEntity getFaculty() {
        return faculty;
    }

    public void setFaculty(FacultyEntity faculty) {
        this.faculty = faculty;
    }
}
