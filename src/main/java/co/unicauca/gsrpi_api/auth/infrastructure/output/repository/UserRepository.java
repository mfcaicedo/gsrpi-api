package co.unicauca.gsrpi_api.auth.infrastructure.output.repository;

import co.unicauca.gsrpi_api.auth.infrastructure.output.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findByEmail(String email);
    UserEntity findByUid(String uid);
}
