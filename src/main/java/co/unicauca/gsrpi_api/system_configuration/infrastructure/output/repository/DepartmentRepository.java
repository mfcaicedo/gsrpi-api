package co.unicauca.gsrpi_api.system_configuration.infrastructure.output.repository;

import co.unicauca.gsrpi_api.system_configuration.infrastructure.output.entity.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentEntity, Long> {
}
