package co.unicauca.gsrpi_api.user_management.infrastructure.output.respository;

import co.unicauca.gsrpi_api.user_management.infrastructure.output.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<PersonEntity, Long> {
    PersonEntity findByUser_UserId(long userUserId);

    PersonEntity findByPersonId(Long personId);
}
