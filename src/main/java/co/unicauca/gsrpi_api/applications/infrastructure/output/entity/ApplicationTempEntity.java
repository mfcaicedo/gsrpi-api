package co.unicauca.gsrpi_api.applications.infrastructure.output.entity;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import jakarta.persistence.*;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "solicitud_temporal")
public class ApplicationTempEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "solicitud_temporal_id")
    private Long applicationTempId;
    @Column(name = "docente_id")
    private Long teacherId;
    @Column(name = "solicitud_descripcion", columnDefinition = "TEXT")
    private String description;
    @Column(name = "solicitud_numero_autores", columnDefinition = "SMALLINT")
    private int numberOfAuthors;
    @Column(name = "solicitud_terminos_condiciones", columnDefinition = "BOOLEAN")
    private boolean termsAndConditions;
    @Column(name= "departamento_id")
    private Long departmentId;
    @Column(name = "tipo_solicitd_cat_id")
    private Long applicationTypeCatId;
    @Column(name = "produccion_titulo_trabajo", columnDefinition = "TEXT")
    private String productionTitle;
    @Column(name = "produccion_area_disciplinar", columnDefinition = "TEXT")
    private String productionDisciplinaryArea;
    @Column(name = "produccion_numero_folios", columnDefinition = "SMALLINT")
    private int productionNumberOfPages;
    @Column(name = "produccion_pagina_inicio", columnDefinition = "SMALLINT")
    private int productionStartPage;
    @Column(name = "produccion_pagina_final", columnDefinition = "SMALLINT")
    private int productionEndPage;
    @Column(name = "produccion_observaciones", columnDefinition = "TEXT")
    private String productionObservations;
    @Column(name = "tipo_produccion_id")
    private Long productionTypeId;
    @Column(name = "produccion_json_datos", columnDefinition = "JSONB")
    @Type(JsonBinaryType.class)
    private String productionJsonData;
    @Column(name = "produccion_mecanismos_pubicacion_cat_id", columnDefinition = "TEXT")
    private String productionPublicationMechanisms; //Se guardara un json porque es un checkbox

    public ApplicationTempEntity() {
    }

    public ApplicationTempEntity(Long applicationTempId, Long teacherId, String description, int numberOfAuthors, boolean termsAndConditions, Long departmentId, Long applicationTypeCatId, String productionTitle, String productionDisciplinaryArea, int productionNumberOfPages, int productionStartPage, int productionEndPage, String productionObservations, Long productionTypeId, String productionJsonData, String productionPublicationMechanisms) {
        this.applicationTempId = applicationTempId;
        this.teacherId = teacherId;
        this.description = description;
        this.numberOfAuthors = numberOfAuthors;
        this.termsAndConditions = termsAndConditions;
        this.departmentId = departmentId;
        this.applicationTypeCatId = applicationTypeCatId;
        this.productionTitle = productionTitle;
        this.productionDisciplinaryArea = productionDisciplinaryArea;
        this.productionNumberOfPages = productionNumberOfPages;
        this.productionStartPage = productionStartPage;
        this.productionEndPage = productionEndPage;
        this.productionObservations = productionObservations;
        this.productionTypeId = productionTypeId;
        this.productionJsonData = productionJsonData;
        this.productionPublicationMechanisms = productionPublicationMechanisms;
    }

    public Long getApplicationTempId() {
        return applicationTempId;
    }

    public void setApplicationTempId(Long applicationTempId) {
        this.applicationTempId = applicationTempId;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumberOfAuthors() {
        return numberOfAuthors;
    }

    public void setNumberOfAuthors(int numberOfAuthors) {
        this.numberOfAuthors = numberOfAuthors;
    }

    public boolean isTermsAndConditions() {
        return termsAndConditions;
    }

    public void setTermsAndConditions(boolean termsAndConditions) {
        this.termsAndConditions = termsAndConditions;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public Long getApplicationTypeCatId() {
        return applicationTypeCatId;
    }

    public void setApplicationTypeCatId(Long applicationTypeCatId) {
        this.applicationTypeCatId = applicationTypeCatId;
    }

    public String getProductionTitle() {
        return productionTitle;
    }

    public void setProductionTitle(String productionTitle) {
        this.productionTitle = productionTitle;
    }

    public String getProductionDisciplinaryArea() {
        return productionDisciplinaryArea;
    }

    public void setProductionDisciplinaryArea(String productionDisciplinaryArea) {
        this.productionDisciplinaryArea = productionDisciplinaryArea;
    }

    public int getProductionNumberOfPages() {
        return productionNumberOfPages;
    }

    public void setProductionNumberOfPages(int productionNumberOfPages) {
        this.productionNumberOfPages = productionNumberOfPages;
    }

    public int getProductionStartPage() {
        return productionStartPage;
    }

    public void setProductionStartPage(int productionStartPage) {
        this.productionStartPage = productionStartPage;
    }

    public int getProductionEndPage() {
        return productionEndPage;
    }

    public void setProductionEndPage(int productionEndPage) {
        this.productionEndPage = productionEndPage;
    }

    public String getProductionObservations() {
        return productionObservations;
    }

    public void setProductionObservations(String productionObservations) {
        this.productionObservations = productionObservations;
    }

    public Long getProductionTypeId() {
        return productionTypeId;
    }

    public void setProductionTypeId(Long productionTypeId) {
        this.productionTypeId = productionTypeId;
    }

    public String getProductionJsonData() {
        return productionJsonData;
    }

    public void setProductionJsonData(String productionJsonData) {
        this.productionJsonData = productionJsonData;
    }

    public String getProductionPublicationMechanisms() {
        return productionPublicationMechanisms;
    }

    public void setProductionPublicationMechanisms(String productionPublicationMechanisms) {
        this.productionPublicationMechanisms = productionPublicationMechanisms;
    }
}
