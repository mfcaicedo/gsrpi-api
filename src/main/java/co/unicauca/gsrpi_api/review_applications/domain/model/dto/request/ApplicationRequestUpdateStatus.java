package co.unicauca.gsrpi_api.review_applications.domain.model.dto.request;

public class ApplicationRequestUpdateStatus {
    private long applicationId;
    private StatusApplicationRequestUpdateStatus statusApplication;

    public ApplicationRequestUpdateStatus() {
    }

    public ApplicationRequestUpdateStatus(long applicationId, StatusApplicationRequestUpdateStatus statusApplication) {
        this.applicationId = applicationId;
        this.statusApplication = statusApplication;
    }

    public long getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(long applicationId) {
        this.applicationId = applicationId;
    }

    public StatusApplicationRequestUpdateStatus getStatusApplication() {
        return statusApplication;
    }

    public void setStatusApplication(StatusApplicationRequestUpdateStatus statusApplication) {
        this.statusApplication = statusApplication;
    }
}
