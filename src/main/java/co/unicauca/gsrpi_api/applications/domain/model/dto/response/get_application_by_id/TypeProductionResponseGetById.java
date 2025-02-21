package co.unicauca.gsrpi_api.applications.domain.model.dto.response.get_application_by_id;

public class TypeProductionResponseGetById {
    private Long typeProductionId;
    private String name;
    private String jsonStructure;
    private String catalogsIds;

    public TypeProductionResponseGetById() {
    }

    public TypeProductionResponseGetById(Long typeProductionId, String name, String jsonStructure, String catalogsIds) {
        this.typeProductionId = typeProductionId;
        this.name = name;
        this.jsonStructure = jsonStructure;
        this.catalogsIds = catalogsIds;
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

    public String getJsonStructure() {
        return jsonStructure;
    }

    public void setJsonStructure(String jsonStructure) {
        this.jsonStructure = jsonStructure;
    }

    public String getCatalogsIds() {
        return catalogsIds;
    }

    public void setCatalogsIds(String catalogsIds) {
        this.catalogsIds = catalogsIds;
    }
}
