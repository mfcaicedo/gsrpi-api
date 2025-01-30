package co.unicauca.gsrpi_api.files.application.usecase;

import co.unicauca.gsrpi_api.files.application.mapper.FileMapper;
import co.unicauca.gsrpi_api.files.application.port.input.FileManagementPort;
import co.unicauca.gsrpi_api.files.application.port.output.FileManagementOutPort;
import co.unicauca.gsrpi_api.files.domain.model.dto.request.FileRequest;
import co.unicauca.gsrpi_api.files.domain.model.dto.request.FileRequestUpdate;
import co.unicauca.gsrpi_api.files.domain.model.dto.response.FileResponse;
import co.unicauca.gsrpi_api.files.domain.model.dto.response.FileResponseGetByPath;

public class FileManagementUseCase implements FileManagementPort {

    private final FileManagementOutPort fileManagementOutPort;
    private final FileMapper fileMapper;

    public FileManagementUseCase(FileManagementOutPort fileManagementOutPort,
                                 FileMapper fileMapper) {
        this.fileManagementOutPort = fileManagementOutPort;
        this.fileMapper = fileMapper;
    }

    @Override
    public FileResponse createFile(FileRequest fileRequest) {
        return this.fileMapper.fileModelToFileResponse(
                this.fileManagementOutPort.createFile(this.fileMapper.fileRequestToFileModel(fileRequest))
        );
    }

    @Override
    public FileResponse updateFile(FileRequestUpdate fileRequestUpdate) {
        return this.fileMapper.fileModelToFileResponse(
                this.fileManagementOutPort.updateFile(this.fileMapper.fileRequestUpdateToFileModel(fileRequestUpdate))
        );
    }

    @Override
    public boolean deleteFileById(Long fileId) {
        return this.fileManagementOutPort.deleteFileById(fileId);
    }

    @Override
    public FileResponseGetByPath getFileByPath(String path) {
        return this.fileMapper.fileModelToFileResponseGetByPath(
                this.fileManagementOutPort.getFileByPath(path)
        );
    }

    @Override
    public FileResponseGetByPath getFileById(Long fileId) {
        return this.fileMapper.fileModelToFileResponseGetByPath(
                this.fileManagementOutPort.getFileById(fileId)
        );
    }
}
