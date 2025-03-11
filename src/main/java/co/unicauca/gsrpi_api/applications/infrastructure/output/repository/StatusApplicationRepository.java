package co.unicauca.gsrpi_api.applications.infrastructure.output.repository;

import co.unicauca.gsrpi_api.applications.infrastructure.output.entity.StatusApplicationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusApplicationRepository extends JpaRepository<StatusApplicationEntity, Long> {
    StatusApplicationEntity findByName(String name);

    boolean existsByName(String name);
}
