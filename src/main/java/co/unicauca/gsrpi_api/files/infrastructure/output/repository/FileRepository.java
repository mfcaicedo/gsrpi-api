package co.unicauca.gsrpi_api.files.infrastructure.output.repository;

import co.unicauca.gsrpi_api.files.infrastructure.output.entity.FileEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<FileEntity, Long> {
    FileEntity deleteByPath(String path);
    FileEntity findByPath(String path);
}
