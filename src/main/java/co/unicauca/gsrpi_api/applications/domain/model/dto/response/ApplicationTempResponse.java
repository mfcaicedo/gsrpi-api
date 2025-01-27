package co.unicauca.gsrpi_api.applications.domain.model.dto.response;

public class ApplicationTempResponse {
    private Long applicationTempId;

    public ApplicationTempResponse() {
    }

    public ApplicationTempResponse(Long applicationTempId) {
        this.applicationTempId = applicationTempId;
    }

    public Long getApplicationTempId() {
        return applicationTempId;
    }

    public void setApplicationTempId(Long applicationTempId) {
        this.applicationTempId = applicationTempId;
    }
}
