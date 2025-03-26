package co.unicauca.gsrpi_api.auth.infrastructure.output.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "privilegio")
public class PrivilegeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "privilegio_id")
    private long privilegeId;
    @Column(name = "nombre",columnDefinition = "TEXT", nullable = false, unique = true)
    private String name;
    @Column(name = "descripcion",columnDefinition = "TEXT", nullable = true)
    private String description;

}
