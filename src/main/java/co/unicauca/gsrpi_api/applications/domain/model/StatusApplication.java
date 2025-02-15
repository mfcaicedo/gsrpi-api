package co.unicauca.gsrpi_api.applications.domain.model;

public class StatusApplication {
    private Long statusApplicationId;
    private String name;
    private String description;

    public StatusApplication() {
    }

    public StatusApplication(Long statusApplicationId, String name, String description) {
        this.statusApplicationId = statusApplicationId;
        this.name = name;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
