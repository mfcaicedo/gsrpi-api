package co.unicauca.gsrpi_api.auth.infrastructure.output.repository;

import co.unicauca.gsrpi_api.auth.infrastructure.output.entity.RoleEntity;
import co.unicauca.gsrpi_api.auth.infrastructure.output.entity.UserRoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRoleEntity, Long> {
}
