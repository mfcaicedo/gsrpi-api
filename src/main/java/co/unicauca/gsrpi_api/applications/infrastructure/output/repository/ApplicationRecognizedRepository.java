package co.unicauca.gsrpi_api.applications.infrastructure.output.repository;

import co.unicauca.gsrpi_api.applications.infrastructure.output.entity.ApplicationRecognizedEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationRecognizedRepository extends JpaRepository<ApplicationRecognizedEntity, Long> {
}
