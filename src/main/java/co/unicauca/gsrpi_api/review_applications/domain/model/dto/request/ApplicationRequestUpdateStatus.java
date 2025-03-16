package co.unicauca.gsrpi_api.review_applications.domain.model.dto.request;

public class ApplicationRequestUpdateStatus {
    private long applicationId;
    private StatusApplicationRequestUpdateStatus applicationStatus;

    public ApplicationRequestUpdateStatus() {
    }

    public ApplicationRequestUpdateStatus(long applicationId, StatusApplicationRequestUpdateStatus applicationStatus) {
        this.applicationId = applicationId;
        this.applicationStatus = applicationStatus;
    }

    public long getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(long applicationId) {
        this.applicationId = applicationId;
    }

    public StatusApplicationRequestUpdateStatus getApplicationStatus() {
        return applicationStatus;
    }

    public void setApplicationStatus(StatusApplicationRequestUpdateStatus applicationStatus) {
        this.applicationStatus = applicationStatus;
    }
}
