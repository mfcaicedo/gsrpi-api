package co.unicauca.gsrpi_api.review_applications.domain.model.dto.request;

public class StatusApplicationRequestUpdateStatus {
    private String name;

    public StatusApplicationRequestUpdateStatus() {
    }

    public StatusApplicationRequestUpdateStatus(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
