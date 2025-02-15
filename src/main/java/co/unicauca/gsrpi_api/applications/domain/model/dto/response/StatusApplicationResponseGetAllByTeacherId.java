package co.unicauca.gsrpi_api.applications.domain.model.dto.response;

public class StatusApplicationResponseGetAllByTeacherId {
    private Long statusApplicationId;
    private String name;

    public StatusApplicationResponseGetAllByTeacherId() {
    }

    public StatusApplicationResponseGetAllByTeacherId(Long statusApplicationId, String name) {
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
