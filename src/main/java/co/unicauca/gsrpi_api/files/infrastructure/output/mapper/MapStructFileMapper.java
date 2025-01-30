package co.unicauca.gsrpi_api.files.infrastructure.output.mapper;

import co.unicauca.gsrpi_api.files.domain.model.FileModel;
import co.unicauca.gsrpi_api.files.infrastructure.output.entity.FileEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MapStructFileMapper {
    FileModel fileEntityToFileModel(FileEntity fileEntity);
    FileEntity fileModelToFileEntity(FileModel fileModel);
}
