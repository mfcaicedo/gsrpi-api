package co.unicauca.gsrpi_api.files.application.port.output;

import co.unicauca.gsrpi_api.files.domain.model.FileModel;

public interface FileManagementOutPort {
    FileModel createFile(FileModel file);
    FileModel updateFile(FileModel file);
    boolean deleteFileById(Long fileId);
    FileModel getFileByPath(String path);
    FileModel getFileById(Long fileId);
}
