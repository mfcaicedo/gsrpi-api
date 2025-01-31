package co.unicauca.gsrpi_api.applications.domain.model;

import co.unicauca.gsrpi_api.applications.infrastructure.output.entity.ProductionEntity;

public class ProductionFile {
    private Long productionFileId;
    private Long fileId; //En tabla archivo debe ser tipo UUID
    private String name;
    //Relacion many to one con produccion
    private ProductionEntity production;

    public ProductionFile() {
    }

    public ProductionFile(Long productionFileId, Long fileId, String name, ProductionEntity production) {
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

    public Long getFileId() {
        return fileId;
    }

    public void setFileId(Long fileId) {
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
