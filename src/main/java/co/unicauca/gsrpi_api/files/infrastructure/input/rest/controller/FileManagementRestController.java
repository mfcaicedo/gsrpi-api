package co.unicauca.gsrpi_api.files.infrastructure.input.rest.controller;

import co.unicauca.gsrpi_api.files.application.port.input.FileManagementPort;
import co.unicauca.gsrpi_api.files.domain.model.dto.request.FileRequest;
import co.unicauca.gsrpi_api.files.domain.model.dto.request.FileRequestUpdate;
import co.unicauca.gsrpi_api.files.domain.model.dto.response.FileResponse;
import co.unicauca.gsrpi_api.files.domain.model.dto.response.FileResponseGetByPath;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("gsrpi-api/v1")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class FileManagementRestController {
    private final FileManagementPort fileManagementPort;

    public FileManagementRestController(FileManagementPort fileManagementPort) {
        this.fileManagementPort = fileManagementPort;
    }

    @PostMapping("subir-archivo")
    public ResponseEntity<FileResponse> uploadFile(@RequestBody FileRequest fileRequest) {
        return ResponseEntity.status(HttpStatus.CREATED).body(
                this.fileManagementPort.createFile(fileRequest)
        );
    }

    @PatchMapping("actualizar-archivo")
    public ResponseEntity<FileResponse> updateFile(@RequestBody FileRequestUpdate fileRequest) {
        return ResponseEntity.status(HttpStatus.OK).body(
                this.fileManagementPort.updateFile(fileRequest)
        );
    }

    @GetMapping("obtener-archivo-por-path/{filePath}")
    public ResponseEntity<FileResponseGetByPath> getFileByPath(@PathVariable String filePath) {
        return ResponseEntity.status(HttpStatus.OK).body(
                this.fileManagementPort.getFileByPath(filePath)
        );
    }

    @GetMapping("obtener-archivo-por-id/{fileId}")
    public ResponseEntity<FileResponseGetByPath> getFileById(@PathVariable Long fileId) {
        return ResponseEntity.status(HttpStatus.OK).body(
                this.fileManagementPort.getFileById(fileId)
        );
    }

    @DeleteMapping("eliminar-archivo-por-id/{fileId}")
    public ResponseEntity<Boolean> deleteFile(@PathVariable Long fileId) {
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(
                this.fileManagementPort.deleteFileById(fileId)
        );

    }
}
