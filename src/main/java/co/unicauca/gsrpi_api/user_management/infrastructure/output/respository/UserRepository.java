package co.unicauca.gsrpi_api.user_management.infrastructure.output.respository;

import co.unicauca.gsrpi_api.user_management.infrastructure.output.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
