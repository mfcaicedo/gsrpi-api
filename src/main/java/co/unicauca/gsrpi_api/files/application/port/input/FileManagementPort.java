package co.unicauca.gsrpi_api.files.application.port.input;

import co.unicauca.gsrpi_api.files.domain.model.dto.request.FileRequest;
import co.unicauca.gsrpi_api.files.domain.model.dto.request.FileRequestUpdate;
import co.unicauca.gsrpi_api.files.domain.model.dto.response.FileResponse;
import co.unicauca.gsrpi_api.files.domain.model.dto.response.FileResponseGetByPath;

public interface FileManagementPort {
    FileResponse createFile(FileRequest fileRequest);
    FileResponse updateFile(FileRequestUpdate fileRequestUpdate);
    boolean deleteFileById(Long fileId);
    FileResponseGetByPath getFileByPath(String path);
    FileResponseGetByPath getFileById(Long fileId);
}
