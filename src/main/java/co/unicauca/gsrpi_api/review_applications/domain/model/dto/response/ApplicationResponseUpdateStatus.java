package co.unicauca.gsrpi_api.review_applications.domain.model.dto.response;

public class ApplicationResponseUpdateStatus {
    private long applicationId;

    public ApplicationResponseUpdateStatus() {
    }

    public ApplicationResponseUpdateStatus(long applicationId) {
        this.applicationId = applicationId;
    }

    public long getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(long applicationId) {
        this.applicationId = applicationId;
    }
}
