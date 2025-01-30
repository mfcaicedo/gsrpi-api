package co.unicauca.gsrpi_api.files.application.mapper;

import co.unicauca.gsrpi_api.files.domain.model.FileModel;
import co.unicauca.gsrpi_api.files.domain.model.dto.request.FileRequest;
import co.unicauca.gsrpi_api.files.domain.model.dto.request.FileRequestUpdate;
import co.unicauca.gsrpi_api.files.domain.model.dto.response.FileResponse;
import co.unicauca.gsrpi_api.files.domain.model.dto.response.FileResponseGetByPath;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FileMapper {
    FileModel fileRequestToFileModel(FileRequest fileRequest);
    FileModel fileRequestUpdateToFileModel(FileRequestUpdate fileRequest);
    FileResponse fileModelToFileResponse(FileModel fileModel);
    FileResponseGetByPath fileModelToFileResponseGetByPath(FileModel fileModel);
}
