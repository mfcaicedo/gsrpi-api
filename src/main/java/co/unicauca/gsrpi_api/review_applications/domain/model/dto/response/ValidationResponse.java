package co.unicauca.gsrpi_api.review_applications.domain.model.dto.response;

public class ValidationResponse {
    private Long validationId;

    public ValidationResponse() {
    }

    public ValidationResponse(Long validationId) {
        this.validationId = validationId;
    }

    public Long getValidationId() {
        return validationId;
    }

    public void setValidationId(Long validationId) {
        this.validationId = validationId;
    }
}
