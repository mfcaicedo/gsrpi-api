package co.unicauca.gsrpi_api.applications.domain.model.dto.request;

import java.util.List;

public class ApplicationRequestCreate {
    Long applicationTempId;
    List<ProductionFileRequestCreate> productionFiles;

    public ApplicationRequestCreate() {
    }

    public ApplicationRequestCreate(Long applicationTempId, List<ProductionFileRequestCreate> productionFiles) {
        this.applicationTempId = applicationTempId;
        this.productionFiles = productionFiles;
    }

    public Long getApplicationTempId() {
        return applicationTempId;
    }

    public void setApplicationTempId(Long applicationTempId) {
        this.applicationTempId = applicationTempId;
    }

    public List<ProductionFileRequestCreate> getProductionFiles() {
        return productionFiles;
    }

    public void setProductionFiles(List<ProductionFileRequestCreate> productionFiles) {
        this.productionFiles = productionFiles;
    }
}
