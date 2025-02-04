package co.unicauca.gsrpi_api.applications.infrastructure.output.repository;

import co.unicauca.gsrpi_api.applications.domain.model.dto.response.ApplicationTempResponse;
import co.unicauca.gsrpi_api.applications.infrastructure.output.entity.ApplicationTempEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationTempRepository extends JpaRepository<ApplicationTempEntity, Long> {
    boolean existsByTeacherId(Long teacherId);
    ApplicationTempEntity findByTeacherId(Long teacherId);
}
