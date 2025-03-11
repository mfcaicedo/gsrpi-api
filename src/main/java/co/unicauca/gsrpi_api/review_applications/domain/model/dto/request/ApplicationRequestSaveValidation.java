package co.unicauca.gsrpi_api.review_applications.domain.model.dto.request;

public class ApplicationRequestSaveValidation {
    private long applicationId;

    public ApplicationRequestSaveValidation() {
    }

    public ApplicationRequestSaveValidation(long applicationId) {
        this.applicationId = applicationId;
    }

    public long getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(long applicationId) {
        this.applicationId = applicationId;
    }
}
