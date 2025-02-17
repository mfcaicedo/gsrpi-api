package co.unicauca.gsrpi_api.applications.infrastructure.output.repository;

import co.unicauca.gsrpi_api.applications.infrastructure.output.entity.ApplicationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApplicationRepository extends JpaRepository<ApplicationEntity, Long> {
    List<ApplicationEntity> findAllByTeacherApplications_Teacher_TeacherId(Long teacherId);

    List<ApplicationEntity> findAllByDepartment_Faculty_FacultyId(long departmentFacultyFacultyId);
}
