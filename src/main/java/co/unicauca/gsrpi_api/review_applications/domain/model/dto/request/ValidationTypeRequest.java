package co.unicauca.gsrpi_api.review_applications.domain.model.dto.request;

public class ValidationTypeRequest {
    private long validationTypeId;

    public ValidationTypeRequest() {
    }

    public ValidationTypeRequest(long validationTypeId) {
        this.validationTypeId = validationTypeId;
    }

    public long getValidationTypeId() {
        return validationTypeId;
    }

    public void setValidationTypeId(long validationTypeId) {
        this.validationTypeId = validationTypeId;
    }
}
