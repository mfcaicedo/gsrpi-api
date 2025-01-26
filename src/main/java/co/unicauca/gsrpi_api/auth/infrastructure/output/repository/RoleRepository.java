package co.unicauca.gsrpi_api.auth.infrastructure.output.repository;

import co.unicauca.gsrpi_api.auth.infrastructure.output.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<RoleEntity, Long> {
    RoleEntity findByRoleId(Long roleId);
    boolean existsByName(String name);
    RoleEntity findByName(String name);
}
