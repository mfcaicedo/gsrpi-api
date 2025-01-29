package co.unicauca.gsrpi_api.applications.infrastructure.output.repository;

import co.unicauca.gsrpi_api.applications.infrastructure.output.entity.TypeProductionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeProductionRepository extends JpaRepository<TypeProductionEntity, Long> {
    TypeProductionEntity findByAlias(String alias);
}
