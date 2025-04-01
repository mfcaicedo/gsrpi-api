package co.unicauca.gsrpi_api.applications.infrastructure.output.entity;

import co.unicauca.gsrpi_api.system_configuration.infrastructure.output.entity.DepartmentEntity;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "solicitud")
public class ApplicationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "solicitud_id")
    private Long applicationId;
    @Column(name = "descripcion", columnDefinition = "TEXT", nullable = true)
    private String description;
    @Column(name = "numero_autores", nullable = false)
    private Integer numberOfAuthors;
    @Column(name = "terminios_condiciones", columnDefinition = "BOOLEAN", nullable = false)
    private Boolean termsAndConditions;
    //Relacion debil con la tabla catalogos que es transversal
    @Column(name = "tipo_solicitud_cat_id", nullable = false)
    private Long applicationTypeCatId;
    @Column(name = "fecha_creacion", columnDefinition = "TIMESTAMPTZ", nullable = false)
    private LocalDateTime createAt;
    @Column(name = "fecha_actualizacion", columnDefinition = "TIMESTAMPTZ", nullable = true)
    private LocalDateTime updateAt;
    @Column(name = "fecha_envio_ciarp", columnDefinition = "TIMESTAMPTZ", nullable = true)
    private LocalDateTime ciarpSendDate;
    //Relacion many to one con departamento
    @ManyToOne
    @JoinColumn(name = "departamento_id", nullable = false)
    private DepartmentEntity department;

    //Relacion one to one con solicitud
    @OneToOne(mappedBy = "application", cascade = {CascadeType.ALL})
    private ProductionEntity production;

    //Relacion many to one con estado_solicitud
    @ManyToOne
    @JoinColumn(name = "estado_solicitud_id", nullable = false)
    private StatusApplicationEntity applicationStatus;
    //Relacion one to many con docente_solicitud (SI falla se debe cambiar )
    @OneToMany(mappedBy = "application", cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    private List<TeacherApplicationEntity> teacherApplications;

    public ApplicationEntity() {
    }

    public ApplicationEntity(Long applicationId, String description, Integer numberOfAuthors, Boolean termsAndConditions, Long applicationTypeCatId, LocalDateTime createAt, LocalDateTime updateAt, LocalDateTime ciarpSendDate, DepartmentEntity department, ProductionEntity production, StatusApplicationEntity applicationStatus, List<TeacherApplicationEntity> teacherApplications) {
        this.applicationId = applicationId;
        this.description = description;
        this.numberOfAuthors = numberOfAuthors;
        this.termsAndConditions = termsAndConditions;
        this.applicationTypeCatId = applicationTypeCatId;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.ciarpSendDate = ciarpSendDate;
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

    public LocalDateTime getCiarpSendDate() {
        return ciarpSendDate;
    }

    public void setCiarpSendDate(LocalDateTime ciarpSendDate) {
        this.ciarpSendDate = ciarpSendDate;
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
