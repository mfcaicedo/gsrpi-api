package co.unicauca.gsrpi_api.applications.infrastructure.output.entity;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import jakarta.persistence.*;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "tipo_produccion")
public class TypeProductionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tipo_pruduccion_id")
    private Long typeProductionId;
    @Column(name = "nombre", columnDefinition = "TEXT", nullable = false)
    private String name;
    @Column(name = "estructura_json", columnDefinition = "jsonb", nullable = false)
    @Type(JsonBinaryType.class)
    private String jsonStructure;
    @Column(name = "calalogos_ids", columnDefinition = "json", nullable = true)
    @Type(JsonBinaryType.class)
    private String catalogsIds;

    public TypeProductionEntity() {
    }

    public TypeProductionEntity(Long typeProductionId, String name, String jsonStructure, String catalogsIds) {
        this.typeProductionId = typeProductionId;
        this.name = name;
        this.jsonStructure = jsonStructure;
        this.catalogsIds = catalogsIds;
    }

    public Long getTypeProductionId() {
        return typeProductionId;
    }

    public void setTypeProductionId(Long typeProductionId) {
        this.typeProductionId = typeProductionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJsonStructure() {
        return jsonStructure;
    }

    public void setJsonStructure(String jsonStructure) {
        this.jsonStructure = jsonStructure;
    }

    public String getCatalogsIds() {
        return catalogsIds;
    }

    public void setCatalogsIds(String catalogsIds) {
        this.catalogsIds = catalogsIds;
    }
}
