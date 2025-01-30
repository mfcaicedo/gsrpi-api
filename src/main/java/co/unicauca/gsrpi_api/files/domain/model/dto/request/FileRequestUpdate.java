package co.unicauca.gsrpi_api.files.domain.model.dto.request;

import java.time.LocalDateTime;

public class FileRequestUpdate {
    private Long fileId;
    private String name;
    private String type; //PDF, DOCX, XLSX, JPG, PNG, MP4, MP3, etc
    private String extension;
    private String path;
    private String observations;
    private Long size;
    private Boolean state; //true: activo, false: inactivo
    private LocalDateTime updateAt;
}
