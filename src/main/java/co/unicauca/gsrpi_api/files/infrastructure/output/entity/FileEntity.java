package co.unicauca.gsrpi_api.files.infrastructure.output.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "archivo")
public class FileEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "archivo_id")
    private Long fileId;
    @Column(name = "nombre", columnDefinition = "TEXT", nullable = false)
    private String name;
    @Column(name = "tipo", columnDefinition = "TEXT", nullable = false)
    private String type; //PDF, DOCX, XLSX, JPG, PNG, MP4, MP3, etc
    @Column(name = "extension", columnDefinition = "TEXT", nullable = false)
    private String extension;
    @Column(name = "ruta", columnDefinition = "TEXT", nullable = false)
    private String path;
    @Column(name = "observaciones", columnDefinition = "TEXT", nullable = true)
    private String observations;
    @Column(name = "tamanio", columnDefinition = "BIGINT", nullable = false)
    private Long size;
    @Column(name = "estado", columnDefinition = "BOOLEAN", nullable = false)
    private Boolean state; //true: activo, false: inactivo
    @Column(name = "fecha_creacion", columnDefinition = "TIMESTAMP", nullable = false)
    private LocalDateTime createAt;
    @Column(name = "fecha_actualizacion", columnDefinition = "TIMESTAMP", nullable = true)
    private LocalDateTime updateAt;

    public FileEntity() {
    }

    public FileEntity(Long fileId, String name, String type, String extension, String path, String observations, Long size, Boolean state, LocalDateTime createAt, LocalDateTime updateAt) {
        this.fileId = fileId;
        this.name = name;
        this.type = type;
        this.extension = extension;
        this.path = path;
        this.observations = observations;
        this.size = size;
        this.state = state;
        this.createAt = createAt;
        this.updateAt = updateAt;
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

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }
}
