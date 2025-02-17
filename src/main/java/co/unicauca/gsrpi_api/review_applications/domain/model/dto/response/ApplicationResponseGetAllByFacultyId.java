package co.unicauca.gsrpi_api.review_applications.domain.model.dto.response;

import co.unicauca.gsrpi_api.applications.domain.model.dto.response.ProductionResponseGetAllByTeacherId;
import co.unicauca.gsrpi_api.applications.domain.model.dto.response.StatusApplicationResponseGetAllByTeacherId;

import java.time.LocalDateTime;
import java.util.List;

public class ApplicationResponseGetAllByFacultyId {
    private Long applicationId;
    private Long applicationTypeCatId;
    private LocalDateTime createAt;
    private DepartmentResponseGetAllByFactultyId department;
    private StatusApplicationResponseGetAllByTeacherId applicationStatus;
    private ProductionResponseGetAllByTeacherId production;
    private List<TeacherApplicationResponseGetAllByFacultyId> teacherApplications;

    public ApplicationResponseGetAllByFacultyId() {
    }

    public ApplicationResponseGetAllByFacultyId(Long applicationId, Long applicationTypeCatId, LocalDateTime createAt, DepartmentResponseGetAllByFactultyId department, StatusApplicationResponseGetAllByTeacherId applicationStatus, ProductionResponseGetAllByTeacherId production, List<TeacherApplicationResponseGetAllByFacultyId> teacherApplications) {
        this.applicationId = applicationId;
        this.applicationTypeCatId = applicationTypeCatId;
        this.createAt = createAt;
        this.department = department;
        this.applicationStatus = applicationStatus;
        this.production = production;
        this.teacherApplications = teacherApplications;
    }

    public Long getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
    }

    public Long getApplicationTypeCatId() {
        return applicationTypeCatId;
    }

    public void setApplicationTypeCatId(Long applicationTypeCatId) {
        this.applicationTypeCatId = applicationTypeCatId;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public DepartmentResponseGetAllByFactultyId getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentResponseGetAllByFactultyId department) {
        this.department = department;
    }

    public StatusApplicationResponseGetAllByTeacherId getApplicationStatus() {
        return applicationStatus;
    }

    public void setApplicationStatus(StatusApplicationResponseGetAllByTeacherId applicationStatus) {
        this.applicationStatus = applicationStatus;
    }

    public ProductionResponseGetAllByTeacherId getProduction() {
        return production;
    }

    public void setProduction(ProductionResponseGetAllByTeacherId production) {
        this.production = production;
    }

    public List<TeacherApplicationResponseGetAllByFacultyId> getTeacherApplications() {
        return teacherApplications;
    }

    public void setTeacherApplications(List<TeacherApplicationResponseGetAllByFacultyId> teacherApplications) {
        this.teacherApplications = teacherApplications;
    }
}
