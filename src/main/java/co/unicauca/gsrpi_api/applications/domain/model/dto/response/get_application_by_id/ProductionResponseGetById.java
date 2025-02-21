package co.unicauca.gsrpi_api.applications.domain.model.dto.response.get_application_by_id;

import co.unicauca.gsrpi_api.applications.domain.model.ProductionFile;

import java.util.List;

public class ProductionResponseGetById {
    private Long productionId;
    private String workTitle;
    private String disciplinaryArea;
    private Integer numberOfPages;
    private Integer startPage;
    private Integer endPage;
    private String observations;
    private String dataJson;
    //Relacion con tabla transversal catalogos (se deja tipo string para guardar el json)
    private String publicationMechanism;
    //Relacion many to one con tipo_produccion
    private TypeProductionResponseGetById productionType;
    //Relacion one to many con produccion_archivo
    private List<ProductionFileResponseGetById> productionFiles;

    public ProductionResponseGetById() {
    }

    public ProductionResponseGetById(Long productionId, String workTitle, String disciplinaryArea, Integer numberOfPages, Integer startPage, Integer endPage, String observations, String dataJson, String publicationMechanism, TypeProductionResponseGetById productionType, List<ProductionFileResponseGetById> productionFiles) {
        this.productionId = productionId;
        this.workTitle = workTitle;
        this.disciplinaryArea = disciplinaryArea;
        this.numberOfPages = numberOfPages;
        this.startPage = startPage;
        this.endPage = endPage;
        this.observations = observations;
        this.dataJson = dataJson;
        this.publicationMechanism = publicationMechanism;
        this.productionType = productionType;
        this.productionFiles = productionFiles;
    }

    public Long getProductionId() {
        return productionId;
    }

    public void setProductionId(Long productionId) {
        this.productionId = productionId;
    }

    public String getWorkTitle() {
        return workTitle;
    }

    public void setWorkTitle(String workTitle) {
        this.workTitle = workTitle;
    }

    public String getDisciplinaryArea() {
        return disciplinaryArea;
    }

    public void setDisciplinaryArea(String disciplinaryArea) {
        this.disciplinaryArea = disciplinaryArea;
    }

    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public Integer getStartPage() {
        return startPage;
    }

    public void setStartPage(Integer startPage) {
        this.startPage = startPage;
    }

    public Integer getEndPage() {
        return endPage;
    }

    public void setEndPage(Integer endPage) {
        this.endPage = endPage;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public String getDataJson() {
        return dataJson;
    }

    public void setDataJson(String dataJson) {
        this.dataJson = dataJson;
    }

    public String getPublicationMechanism() {
        return publicationMechanism;
    }

    public void setPublicationMechanism(String publicationMechanism) {
        this.publicationMechanism = publicationMechanism;
    }

    public TypeProductionResponseGetById getProductionType() {
        return productionType;
    }

    public void setProductionType(TypeProductionResponseGetById productionType) {
        this.productionType = productionType;
    }

    public List<ProductionFileResponseGetById> getProductionFiles() {
        return productionFiles;
    }

    public void setProductionFiles(List<ProductionFileResponseGetById> productionFiles) {
        this.productionFiles = productionFiles;
    }
}
