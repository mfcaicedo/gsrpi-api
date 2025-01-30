package co.unicauca.gsrpi_api.files.infrastructure.output.adapter;

import co.unicauca.gsrpi_api.files.application.port.output.FileManagementOutPort;
import co.unicauca.gsrpi_api.files.domain.model.FileModel;
import co.unicauca.gsrpi_api.files.infrastructure.output.mapper.MapStructFileMapper;
import co.unicauca.gsrpi_api.files.infrastructure.output.repository.FileRepository;
import org.springframework.stereotype.Service;

@Service
public class FileManagementAdapter implements FileManagementOutPort {
    private final FileRepository fileRepository;
    private final MapStructFileMapper mapStructFileMapper;

    public FileManagementAdapter(FileRepository fileRepository, MapStructFileMapper mapStructFileMapper) {
        this.mapStructFileMapper = mapStructFileMapper;
        this.fileRepository = fileRepository;
    }

    @Override
    public FileModel createFile(FileModel file) {
        return this.mapStructFileMapper.fileEntityToFileModel(this.fileRepository.save(
                this.mapStructFileMapper.fileModelToFileEntity(file))
        );
    }

    @Override
    public FileModel updateFile(FileModel file) {
        return this.mapStructFileMapper.fileEntityToFileModel(this.fileRepository.save(
                this.mapStructFileMapper.fileModelToFileEntity(file))
        );
    }

    @Override
    public boolean deleteFileById(Long fileId) {
        this.fileRepository.deleteById(fileId);
        //Valido si fue eliminado correctamente
        return this.fileRepository.findById(fileId).isEmpty();
    }

    @Override
    public FileModel getFileByPath(String path) {
        return this.mapStructFileMapper.fileEntityToFileModel(this.fileRepository.findByPath(path));
    }

    @Override
    public FileModel getFileById(Long fileId) {
        return this.mapStructFileMapper.fileEntityToFileModel(this.fileRepository.findById(fileId).orElse(null));
    }
}
