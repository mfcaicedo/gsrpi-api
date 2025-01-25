package co.unicauca.gsrpi_api.system_configuration.infrastructure.output.repository;

import co.unicauca.gsrpi_api.system_configuration.infrastructure.output.entity.FacultyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacultyRepository extends JpaRepository<FacultyEntity, Long> {
}
