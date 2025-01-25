package co.unicauca.gsrpi_api.system_configuration.infrastructure.output.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "departamento")
public class DepartmentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "departamento_id")
    private long departmentId;
    @Column(name = "nombre")
    private String name;
    @Column(name = "ubicacion", nullable = true)
    private String location;

    @ManyToOne
    @JoinColumn(name = "facultad_id")
    private FacultyEntity faculty;

    public DepartmentEntity() {
    }

    public DepartmentEntity(String name, String location) {
        this.name = name;
        this.location = location;
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
}
