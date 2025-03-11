package co.unicauca.gsrpi_api.review_applications.infrastructure.output.repository;

import co.unicauca.gsrpi_api.review_applications.infrastructure.output.entity.ValidationTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ValidationTypeRepository extends JpaRepository<ValidationTypeEntity, Long> {
}
