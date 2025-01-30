package co.unicauca.gsrpi_api.files.domain.model.dto.request;

import java.time.LocalDateTime;

public class FileRequest {
    private String name;
    private String type; //PDF, DOCX, XLSX, JPG, PNG, MP4, MP3, etc
    private String extension;
    private String path;
    private String observations;
    private Long size;
    private Boolean state; //true: activo, false: inactivo
    private LocalDateTime createAt;

    public FileRequest() {
    }

    public FileRequest(String name, String type, String extension, String path, String observations, Long size, Boolean state, LocalDateTime createAt) {
        this.name = name;
        this.type = type;
        this.extension = extension;
        this.path = path;
        this.observations = observations;
        this.size = size;
        this.state = state;
        this.createAt = createAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }
}
