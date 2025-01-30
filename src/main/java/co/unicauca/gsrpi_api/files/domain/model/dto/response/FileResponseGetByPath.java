package co.unicauca.gsrpi_api.files.domain.model.dto.response;

public class FileResponseGetByPath {
    private String name;
    private String type; //PDF, DOCX, XLSX, JPG, PNG, MP4, MP3, etc
    private String extension;
    private String path;
    private Boolean state; //true: activo, false: inactivo

    public FileResponseGetByPath() {
    }

    public FileResponseGetByPath(String name, String type, String extension, String path, Boolean state) {
        this.name = name;
        this.type = type;
        this.extension = extension;
        this.path = path;
        this.state = state;
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

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }
}
