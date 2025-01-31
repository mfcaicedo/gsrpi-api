package co.unicauca.gsrpi_api.applications.domain.model.dto.response;

public class ApplicationResponseCreate {
    private Long applicationId;

    public ApplicationResponseCreate() {
    }

    public ApplicationResponseCreate(Long applicationId) {
        this.applicationId = applicationId;
    }

    public Long getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
    }
}
