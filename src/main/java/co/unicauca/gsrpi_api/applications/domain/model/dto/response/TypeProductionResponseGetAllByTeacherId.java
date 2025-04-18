package co.unicauca.gsrpi_api.applications.domain.model.dto.response;

public class TypeProductionResponseGetAllByTeacherId {
    private Long typeProductionId;
    private String name;

    public TypeProductionResponseGetAllByTeacherId() {
    }

    public TypeProductionResponseGetAllByTeacherId(Long typeProductionId, String name) {
        this.typeProductionId = typeProductionId;
        this.name = name;
    }

    public Long getTypeProductionId() {
        return typeProductionId;
    }

    public void setTypeProductionId(Long typeProductionId) {
        this.typeProductionId = typeProductionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
