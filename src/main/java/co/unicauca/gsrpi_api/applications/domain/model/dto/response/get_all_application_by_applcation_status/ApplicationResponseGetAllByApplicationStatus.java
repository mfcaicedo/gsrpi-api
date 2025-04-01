package co.unicauca.gsrpi_api.applications.domain.model.dto.response.get_all_application_by_applcation_status;

import java.time.LocalDateTime;
import java.util.List;

public class ApplicationResponseGetAllByApplicationStatus {
    private Long applicationId;
    private Long applicationTypeCatId;
    private LocalDateTime createAt;
    private LocalDateTime ciarpSendDate;
    private DepartmentResponseGetAllByApplicationStatus department;
    private StatusApplicationResponseGetAllByApplicationStatus applicationStatus;
    private ProductionResponseGetAllByApplicationStatus production;
    private List<TeacherApplicationResponseGetAllByApplicationStatus> teacherApplications;

    public ApplicationResponseGetAllByApplicationStatus() {
    }

    public ApplicationResponseGetAllByApplicationStatus(Long applicationId, Long applicationTypeCatId, LocalDateTime createAt, LocalDateTime ciarpSendDate, DepartmentResponseGetAllByApplicationStatus department, StatusApplicationResponseGetAllByApplicationStatus applicationStatus, ProductionResponseGetAllByApplicationStatus production, List<TeacherApplicationResponseGetAllByApplicationStatus> teacherApplications) {
        this.applicationId = applicationId;
        this.applicationTypeCatId = applicationTypeCatId;
        this.createAt = createAt;
        this.ciarpSendDate = ciarpSendDate;
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

    public LocalDateTime getCiarpSendDate() {
        return ciarpSendDate;
    }

    public void setCiarpSendDate(LocalDateTime ciarpSendDate) {
        this.ciarpSendDate = ciarpSendDate;
    }

    public DepartmentResponseGetAllByApplicationStatus getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentResponseGetAllByApplicationStatus department) {
        this.department = department;
    }

    public StatusApplicationResponseGetAllByApplicationStatus getApplicationStatus() {
        return applicationStatus;
    }

    public void setApplicationStatus(StatusApplicationResponseGetAllByApplicationStatus applicationStatus) {
        this.applicationStatus = applicationStatus;
    }

    public ProductionResponseGetAllByApplicationStatus getProduction() {
        return production;
    }

    public void setProduction(ProductionResponseGetAllByApplicationStatus production) {
        this.production = production;
    }

    public List<TeacherApplicationResponseGetAllByApplicationStatus> getTeacherApplications() {
        return teacherApplications;
    }

    public void setTeacherApplications(List<TeacherApplicationResponseGetAllByApplicationStatus> teacherApplications) {
        this.teacherApplications = teacherApplications;
    }
}
