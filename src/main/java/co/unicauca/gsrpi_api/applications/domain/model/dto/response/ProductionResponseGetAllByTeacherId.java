package co.unicauca.gsrpi_api.applications.domain.model.dto.response;

public class ProductionResponseGetAllByTeacherId {
    private Long productionId;
    private String workTitle;
    private TypeProductionResponseGetAllByTeacherId productionType;

    public ProductionResponseGetAllByTeacherId() {
    }

    public ProductionResponseGetAllByTeacherId(Long productionId, String workTitle, TypeProductionResponseGetAllByTeacherId productionType) {
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

    public TypeProductionResponseGetAllByTeacherId getProductionType() {
        return productionType;
    }

    public void setProductionType(TypeProductionResponseGetAllByTeacherId productionType) {
        this.productionType = productionType;
    }
}
