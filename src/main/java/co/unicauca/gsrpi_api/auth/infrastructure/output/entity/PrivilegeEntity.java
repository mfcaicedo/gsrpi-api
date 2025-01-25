package co.unicauca.gsrpi_api.auth.infrastructure.output.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "privilegio")
public class PrivilegeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "privilegio_id")
    private long privilegeId;
    @Column(name = "nombre", nullable = false, length = 50, unique = true)
    private String name;
    @Column(name = "descripcion", nullable = true, length = 200)
    private String description;

}
