package co.unicauca.gsrpi_api.files.domain.model.dto.response;

public class FileResponse {
    private Long fileId;

    public FileResponse() {
    }

    public FileResponse(Long fileId) {
        this.fileId = fileId;
    }

    public Long getFileId() {
        return fileId;
    }

    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }
}
