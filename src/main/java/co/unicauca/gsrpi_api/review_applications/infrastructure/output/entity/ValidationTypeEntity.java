package co.unicauca.gsrpi_api.review_applications.infrastructure.output.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tipo_validacion")
public class ValidationTypeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tipo_validacion_id")
    private long validationTypeId;
    @Column(name = "nombre_tipo_validacion")
    private String validationTypeName;
    @Column(name = "descripcion")
    private String description;

    public ValidationTypeEntity() {
    }

    public ValidationTypeEntity(long validationTypeId, String validationTypeName, String description) {
        this.validationTypeId = validationTypeId;
        this.validationTypeName = validationTypeName;
        this.description = description;
    }

    public long getValidationTypeId() {
        return validationTypeId;
    }

    public void setValidationTypeId(long validationTypeId) {
        this.validationTypeId = validationTypeId;
    }

    public String getValidationTypeName() {
        return validationTypeName;
    }

    public void setValidationTypeName(String validationTypeName) {
        this.validationTypeName = validationTypeName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
