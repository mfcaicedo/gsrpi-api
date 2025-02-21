package co.unicauca.gsrpi_api.applications.domain.model.dto.response.get_application_by_id;

import co.unicauca.gsrpi_api.applications.infrastructure.output.entity.ProductionEntity;

public class ProductionFileResponseGetById {
    private Long productionFileId;
    private Long fileId;
    private String name;

    public ProductionFileResponseGetById() {
    }

    public ProductionFileResponseGetById(Long productionFileId, Long fileId, String name) {
        this.productionFileId = productionFileId;
        this.fileId = fileId;
        this.name = name;
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
}
