package co.unicauca.gsrpi_api.applications.domain.model;

import co.unicauca.gsrpi_api.applications.infrastructure.output.entity.ProductionEntity;
import co.unicauca.gsrpi_api.applications.infrastructure.output.entity.StatusApplicationEntity;
import co.unicauca.gsrpi_api.applications.infrastructure.output.entity.TeacherApplicationEntity;
import co.unicauca.gsrpi_api.system_configuration.infrastructure.output.entity.DepartmentEntity;

import java.time.LocalDateTime;
import java.util.List;

public class Application {
    private Long applicationId;
    private String description;
    private Integer numberOfAuthors;
    private Boolean termsAndConditions;
    //Relacion debil con la tabla catalogos que es transversal
    private Long applicationTypeCatId;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
    //Relacion many to one con departamento
    private DepartmentEntity department;
    //Relacion one to one con produccion
    private ProductionEntity production;
    //Relacion many to one con estado_solicitud
    private StatusApplicationEntity applicationStatus;
    //Relacion one to many con docente_solicitud (SI falla se debe cambiar )
    private List<TeacherApplicationEntity> teacherApplications;

    public Application() {
    }

    public Application(Long applicationId, String description, Integer numberOfAuthors, Boolean termsAndConditions, Long applicationTypeCatId, LocalDateTime createAt, LocalDateTime updateAt, DepartmentEntity department, ProductionEntity production, StatusApplicationEntity applicationStatus, List<TeacherApplicationEntity> teacherApplications) {
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

    public DepartmentEntity getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentEntity department) {
        this.department = department;
    }

    public ProductionEntity getProduction() {
        return production;
    }

    public void setProduction(ProductionEntity production) {
        this.production = production;
    }

    public StatusApplicationEntity getApplicationStatus() {
        return applicationStatus;
    }

    public void setApplicationStatus(StatusApplicationEntity applicationStatus) {
        this.applicationStatus = applicationStatus;
    }

    public List<TeacherApplicationEntity> getTeacherApplications() {
        return teacherApplications;
    }

    public void setTeacherApplications(List<TeacherApplicationEntity> teacherApplications) {
        this.teacherApplications = teacherApplications;
    }
}
