package co.unicauca.gsrpi_api.applications.domain.model.dto.response.get_all_application_by_applcation_status;

import co.unicauca.gsrpi_api.applications.domain.model.dto.response.TypeProductionResponseGetAllByTeacherId;

public class ProductionResponseGetAllByApplicationStatus {
    private Long productionId;
    private String workTitle;
    private TypeProductionResponseGetAllByApplicationStatus productionType;

    public ProductionResponseGetAllByApplicationStatus() {
    }

    public ProductionResponseGetAllByApplicationStatus(Long productionId, String workTitle, TypeProductionResponseGetAllByApplicationStatus productionType) {
        this.productionId = productionId;
        this.workTitle = workTitle;
        this.productionType = productionType;
    }

    public Long getProductionId() {
        return productionId;
    }

    public void setProductionId(Long productionId) {
        this.productionId = productionId;
    }

    public String getWorkTitle() {
        return workTitle;
    }

    public void setWorkTitle(String workTitle) {
        this.workTitle = workTitle;
    }

    public TypeProductionResponseGetAllByApplicationStatus getProductionType() {
        return productionType;
    }

    public void setProductionType(TypeProductionResponseGetAllByApplicationStatus productionType) {
        this.productionType = productionType;
    }
}
