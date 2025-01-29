package co.unicauca.gsrpi_api.applications.domain.model.dto.response;

public class ApplicationRecognizedResponse {
    private Long applicationRecognizedId;

    public ApplicationRecognizedResponse() {
    }

    public ApplicationRecognizedResponse(Long applicationRecognizedId) {
        this.applicationRecognizedId = applicationRecognizedId;
    }

    public Long getApplicationRecognizedId() {
        return applicationRecognizedId;
    }

    public void setApplicationRecognizedId(Long applicationRecognizedId) {
        this.applicationRecognizedId = applicationRecognizedId;
    }
}
