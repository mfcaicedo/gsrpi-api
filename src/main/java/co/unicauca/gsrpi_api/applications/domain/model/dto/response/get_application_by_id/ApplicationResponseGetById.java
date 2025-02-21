package co.unicauca.gsrpi_api.applications.domain.model.dto.response.get_application_by_id;

import co.unicauca.gsrpi_api.applications.domain.model.dto.response.StatusApplicationResponseGetAllByTeacherId;
import co.unicauca.gsrpi_api.applications.infrastructure.output.entity.TeacherApplicationEntity;

import java.time.LocalDateTime;
import java.util.List;

public class ApplicationResponseGetById {
    private Long applicationId;
    private String description;
    private Integer numberOfAuthors;
    private Boolean termsAndConditions;
    //Relacion debil con la tabla catalogos que es transversal
    private Long applicationTypeCatId;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
    //Relacion many to one con departamento
    private DepartmentResponseGetById department;
    //Relacion one to one con produccion
    private ProductionResponseGetById production;
    //Relacion many to one con estado_solicitud
    private StatusApplicationResponseGetAllByTeacherId applicationStatus;
    //Relacion one to many con docente_solicitud
    private List<TeacherApplicationGetById> teacherApplications;

    public ApplicationResponseGetById() {
    }

    public ApplicationResponseGetById(Long applicationId, String description, Integer numberOfAuthors, Boolean termsAndConditions, Long applicationTypeCatId, LocalDateTime createAt, LocalDateTime updateAt, DepartmentResponseGetById department, ProductionResponseGetById production, StatusApplicationResponseGetAllByTeacherId applicationStatus, List<TeacherApplicationGetById> teacherApplications) {
        this.applicationId = applicationId;
        this.description = description;
        this.numberOfAuthors = numberOfAuthors;
        this.termsAndConditions = termsAndConditions;
        this.applicationTypeCatId = applicationTypeCatId;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.department = department;
        this.production = production;
        this.applicationStatus = applicationStatus;
        this.teacherApplications = teacherApplications;
    }

    public Long getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getNumberOfAuthors() {
        return numberOfAuthors;
    }

    public void setNumberOfAuthors(Integer numberOfAuthors) {
        this.numberOfAuthors = numberOfAuthors;
    }

    public Boolean getTermsAndConditions() {
        return termsAndConditions;
    }

    public void setTermsAndConditions(Boolean termsAndConditions) {
        this.termsAndConditions = termsAndConditions;
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

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }

    public DepartmentResponseGetById getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentResponseGetById department) {
        this.department = department;
    }

    public ProductionResponseGetById getProduction() {
        return production;
    }

    public void setProduction(ProductionResponseGetById production) {
        this.production = production;
    }

    public StatusApplicationResponseGetAllByTeacherId getApplicationStatus() {
        return applicationStatus;
    }

    public void setApplicationStatus(StatusApplicationResponseGetAllByTeacherId applicationStatus) {
        this.applicationStatus = applicationStatus;
    }

    public List<TeacherApplicationGetById> getTeacherApplications() {
        return teacherApplications;
    }

    public void setTeacherApplications(List<TeacherApplicationGetById> teacherApplications) {
        this.teacherApplications = teacherApplications;
    }
}
