package co.unicauca.gsrpi_api.applications.infrastructure.output.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "estado_solicitud")
public class StatusApplicationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "estado_solicitud_id")
    private Long statusApplicationId;
    @Column(name = "nombre", columnDefinition = "TEXT", nullable = false)
    private String name;
    @Column(name = "descripcion", columnDefinition = "TEXT", nullable = true)
    private String description;

    public StatusApplicationEntity() {
    }

    public StatusApplicationEntity(Long statusApplicationId, String name, String description) {
        this.statusApplicationId = statusApplicationId;
        this.name = name;
        this.description = description;
    }

    public Long getStatusApplicationId() {
        return statusApplicationId;
    }

    public void setStatusApplicationId(Long statusApplicationId) {
        this.statusApplicationId = statusApplicationId;
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
