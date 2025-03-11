package co.unicauca.gsrpi_api.review_applications.domain.model.dto.response;

public class ValidationTypeResponseGetAll {
    private long validationTypeId;
    private String validationTypeName;

    public ValidationTypeResponseGetAll() {
    }

    public ValidationTypeResponseGetAll(long validationTypeId, String validationTypeName) {
        this.validationTypeId = validationTypeId;
        this.validationTypeName = validationTypeName;
    }

    public long getValidationTypeId() {
        return validationTypeId;
    }

    public void setValidationTypeId(long validationTypeId) {
        this.validationTypeId = validationTypeId;
    }

    public String getValidationTypeName() {
        return validationTypeName;
    }

    public void setValidationTypeName(String validationTypeName) {
        this.validationTypeName = validationTypeName;
    }

}
