package co.unicauca.gsrpi_api.auth.infrastructure.output.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "rol_privilegio")
public class RolePrivilegeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rol_privilegio_id")
    private long rolePrivilegeId;

    @ManyToOne
    @JoinColumn(name = "rol_id")
    private RoleEntity role;

    @ManyToOne
    @JoinColumn(name = "privilegio_id")
    private PrivilegeEntity privilege;

}
