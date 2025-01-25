package co.unicauca.gsrpi_api.auth.infrastructure.output.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "rol")
public class RoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rol_id")
    private long roleId;
    @Column(name = "nombre", unique = true)
    private String name;
    @Column(name = "descripcion")
    private String description;

    public RoleEntity() {
    }

    public RoleEntity(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
