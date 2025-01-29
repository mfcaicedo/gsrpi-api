package co.unicauca.gsrpi_api.applications.infrastructure.output.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "produccion_archivo")
public class ProductionFileEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "produccion_archivo_id")
    private Long productionFileId;
    @Column(name = "archivo_id",columnDefinition = "UUID", nullable = false)
    private String fileId; //En tabla archivo debe ser tipo UUID
    @Column(name = "nombre", columnDefinition = "TEXT", nullable = false)
    private String name;
    //Relacion many to one con produccion
    @ManyToOne
    @JoinColumn(name = "produccion_id", nullable = false)
    private ProductionEntity production;

    public ProductionFileEntity() {
    }

    public ProductionFileEntity(Long productionFileId, String fileId, String name, ProductionEntity production) {
        this.productionFileId = productionFileId;
        this.fileId = fileId;
        this.name = name;
        this.production = production;
    }

    public Long getProductionFileId() {
        return productionFileId;
    }

    public void setProductionFileId(Long productionFileId) {
        this.productionFileId = productionFileId;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductionEntity getProduction() {
        return production;
    }

    public void setProduction(ProductionEntity production) {
        this.production = production;
    }
}
