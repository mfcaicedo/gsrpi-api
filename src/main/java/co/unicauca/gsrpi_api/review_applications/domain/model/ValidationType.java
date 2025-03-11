package co.unicauca.gsrpi_api.review_applications.domain.model;

public class ValidationType {
    private long validationTypeId;
    private String validationTypeName;
    private String description;

    public ValidationType() {
    }

    public ValidationType(long validationTypeId, String validationTypeName, String description) {
        this.validationTypeId = validationTypeId;
        this.validationTypeName = validationTypeName;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
