package co.unicauca.gsrpi_api.review_applications.infrastructure.output.repository;

import co.unicauca.gsrpi_api.review_applications.infrastructure.output.entity.ValidationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ValidationRepository extends JpaRepository<ValidationEntity, Long> {
    List<ValidationEntity> findAllByApplication_ApplicationId(Long applicationId);
    List<ValidationEntity> findAllByApplication_ApplicationIdAndPerson_PersonId(Long applicationApplicationId, Long personPersonId);
    ValidationEntity findByValidationId(long validationId);
}
