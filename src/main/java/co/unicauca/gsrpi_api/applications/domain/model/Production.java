package co.unicauca.gsrpi_api.applications.domain.model;

import java.util.List;

public class Production {
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
    private TypeProduction productionType;
    //Relacion one to one con solicitud
    private Application application;
    //Relacion one to many con produccion_archivo
    private List<ProductionFile> productionFiles;

    public Production() {
    }

    public Production(Long productionId, String workTitle, String disciplinaryArea, Integer numberOfPages, Integer startPage, Integer endPage, String observations, String dataJson, String publicationMechanism, TypeProduction productionType, Application application, List<ProductionFile> productionFiles) {
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
        this.application = application;
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

    public TypeProduction getProductionType() {
        return productionType;
    }

    public void setProductionType(TypeProduction productionType) {
        this.productionType = productionType;
    }

    public Application getApplication() {
        return application;
    }

    public void setApplication(Application application) {
        this.application = application;
    }

    public List<ProductionFile> getProductionFiles() {
        return productionFiles;
    }

    public void setProductionFiles(List<ProductionFile> productionFiles) {
        this.productionFiles = productionFiles;
    }
}
