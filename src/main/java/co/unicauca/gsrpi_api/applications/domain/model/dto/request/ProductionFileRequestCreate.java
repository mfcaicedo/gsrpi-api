package co.unicauca.gsrpi_api.applications.domain.model.dto.request;

public class ProductionFileRequestCreate {
    private Long fileId;
    private String name;

    public ProductionFileRequestCreate() {
    }

    public ProductionFileRequestCreate(Long fileId, String name) {
        this.fileId = fileId;
        this.name = name;
    }

    public Long getFileId() {
        return fileId;
    }

    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
