package co.unicauca.gsrpi_api.review_applications.infrastructure.output.repository;

import co.unicauca.gsrpi_api.applications.domain.model.TeacherApplication;
import co.unicauca.gsrpi_api.applications.infrastructure.output.entity.TeacherApplicationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherApplicationRepository extends JpaRepository<TeacherApplicationEntity, Long> {
    TeacherApplicationEntity findByTeacherApplicationId(Long teacherApplicationId);
}
