package co.unicauca.gsrpi_api.applications.domain.model.dto.request;

public class ApplicationTempRequest {
    private Long applicationTempId;
    private Long teacherId;
    private String description;
    private int numberOfAuthors;
    private boolean termsAndConditions;
    private Long departmentId;
    private Long applicationTypeCatId;
    private String productionTitle;
    private String productionDisciplinaryArea;
    private int productionNumberOfPages;
    private int productionStartPage;
    private int productionEndPage;
    private String productionObservations;
    private Long productionTypeId;
    private String productionJsonData;
    private String productionPublicationMechanisms;

    public ApplicationTempRequest() {
    }

    public ApplicationTempRequest(Long applicationTempId, Long teacherId, String description, int numberOfAuthors, boolean termsAndConditions, Long departmentId, Long applicationTypeCatId, String productionTitle, String productionDisciplinaryArea, int productionNumberOfPages, int productionStartPage, int productionEndPage, String productionObservations, Long productionTypeId, String productionJsonData, String productionPublicationMechanisms) {
        this.applicationTempId = applicationTempId;
        this.teacherId = teacherId;
        this.description = description;
        this.numberOfAuthors = numberOfAuthors;
        this.termsAndConditions = termsAndConditions;
        this.departmentId = departmentId;
        this.applicationTypeCatId = applicationTypeCatId;
        this.productionTitle = productionTitle;
        this.productionDisciplinaryArea = productionDisciplinaryArea;
        this.productionNumberOfPages = productionNumberOfPages;
        this.productionStartPage = productionStartPage;
        this.productionEndPage = productionEndPage;
        this.productionObservations = productionObservations;
        this.productionTypeId = productionTypeId;
        this.productionJsonData = productionJsonData;
        this.productionPublicationMechanisms = productionPublicationMechanisms;
    }

    public Long getApplicationTempId() {
        return applicationTempId;
    }

    public void setApplicationTempId(Long applicationTempId) {
        this.applicationTempId = applicationTempId;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumberOfAuthors() {
        return numberOfAuthors;
    }

    public void setNumberOfAuthors(int numberOfAuthors) {
        this.numberOfAuthors = numberOfAuthors;
    }

    public boolean isTermsAndConditions() {
        return termsAndConditions;
    }

    public void setTermsAndConditions(boolean termsAndConditions) {
        this.termsAndConditions = termsAndConditions;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public Long getApplicationTypeCatId() {
        return applicationTypeCatId;
    }

    public void setApplicationTypeCatId(Long applicationTypeCatId) {
        this.applicationTypeCatId = applicationTypeCatId;
    }

    public String getProductionTitle() {
        return productionTitle;
    }

    public void setProductionTitle(String productionTitle) {
        this.productionTitle = productionTitle;
    }

    public String getProductionDisciplinaryArea() {
        return productionDisciplinaryArea;
    }

    public void setProductionDisciplinaryArea(String productionDisciplinaryArea) {
        this.productionDisciplinaryArea = productionDisciplinaryArea;
    }

    public int getProductionNumberOfPages() {
        return productionNumberOfPages;
    }

    public void setProductionNumberOfPages(int productionNumberOfPages) {
        this.productionNumberOfPages = productionNumberOfPages;
    }

    public int getProductionStartPage() {
        return productionStartPage;
    }

    public void setProductionStartPage(int productionStartPage) {
        this.productionStartPage = productionStartPage;
    }

    public int getProductionEndPage() {
        return productionEndPage;
    }

    public void setProductionEndPage(int productionEndPage) {
        this.productionEndPage = productionEndPage;
    }

    public String getProductionObservations() {
        return productionObservations;
    }

    public void setProductionObservations(String productionObservations) {
        this.productionObservations = productionObservations;
    }

    public Long getProductionTypeId() {
        return productionTypeId;
    }

    public void setProductionTypeId(Long productionTypeId) {
        this.productionTypeId = productionTypeId;
    }

    public String getProductionJsonData() {
        return productionJsonData;
    }

    public void setProductionJsonData(String productionJsonData) {
        this.productionJsonData = productionJsonData;
    }

    public String getProductionPublicationMechanisms() {
        return productionPublicationMechanisms;
    }

    public void setProductionPublicationMechanisms(String productionPublicationMechanisms) {
        this.productionPublicationMechanisms = productionPublicationMechanisms;
    }
}
