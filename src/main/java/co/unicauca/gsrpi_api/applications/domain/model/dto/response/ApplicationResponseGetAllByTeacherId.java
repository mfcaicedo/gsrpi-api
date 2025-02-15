package co.unicauca.gsrpi_api.applications.domain.model.dto.response;

import java.time.LocalDateTime;

public class ApplicationResponseGetAllByTeacherId {
    private Long applicationId;
    private Long applicationTypeCatId;
    private LocalDateTime createAt;
    private StatusApplicationResponseGetAllByTeacherId applicationStatus;
    private ProductionResponseGetAllByTeacherId production;

    public ApplicationResponseGetAllByTeacherId() {
    }

    public ApplicationResponseGetAllByTeacherId(Long applicationId, Long applicationTypeCatId, LocalDateTime createAt, StatusApplicationResponseGetAllByTeacherId applicationStatus, ProductionResponseGetAllByTeacherId production) {
        this.applicationId = applicationId;
        this.applicationTypeCatId = applicationTypeCatId;
        this.createAt = createAt;
        this.applicationStatus = applicationStatus;
        this.production = production;
    }

    public Long getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
    }

    public Long getApplicationTypeCatId() {
        return applicationTypeCatId;
    }

    public void setApplicationTypeCatId(Long applicationTypeCatId) {
        this.applicationTypeCatId = applicationTypeCatId;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public StatusApplicationResponseGetAllByTeacherId getApplicationStatus() {
        return applicationStatus;
    }

    public void setApplicationStatus(StatusApplicationResponseGetAllByTeacherId applicationStatus) {
        this.applicationStatus = applicationStatus;
    }

    public ProductionResponseGetAllByTeacherId getProduction() {
        return production;
    }

    public void setProduction(ProductionResponseGetAllByTeacherId production) {
        this.production = production;
    }
}
