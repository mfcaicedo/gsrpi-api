package co.unicauca.gsrpi_api.applications.domain.model;

public class TypeProduction {
    private Long typeProductionId;
    private String name;
    private String jsonStructure;
    private String alias;
    private String catalogsIds;

    public TypeProduction() {
    }

    public TypeProduction(Long typeProductionId, String name, String jsonStructure, String alias, String catalogsIds) {
        this.typeProductionId = typeProductionId;
        this.name = name;
        this.jsonStructure = jsonStructure;
        this.alias = alias;
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

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getCatalogsIds() {
        return catalogsIds;
    }

    public void setCatalogsIds(String catalogsIds) {
        this.catalogsIds = catalogsIds;
    }
}
