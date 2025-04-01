package co.unicauca.gsrpi_api.applications.domain.model.dto.response.get_all_application_by_applcation_status;

public class StatusApplicationResponseGetAllByApplicationStatus {
    private Long statusApplicationId;
    private String name;

    public StatusApplicationResponseGetAllByApplicationStatus() {
    }

    public StatusApplicationResponseGetAllByApplicationStatus(Long statusApplicationId, String name) {
        this.statusApplicationId = statusApplicationId;
        this.name = name;
    }

    public Long getStatusApplicationId() {
        return statusApplicationId;
    }

    public void setStatusApplicationId(Long statusApplicationId) {
        this.statusApplicationId = statusApplicationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
