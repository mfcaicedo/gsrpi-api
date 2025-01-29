package co.unicauca.gsrpi_api.applications.infrastructure.output.entity;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import jakarta.persistence.*;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "produccion")
public class ProductionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "produccion_id")
    private Long productionId;
    @Column(name = "titulo_trabajo", columnDefinition = "TEXT", nullable = false)
    private String workTitle;
    @Column(name = "area_disciplinar", columnDefinition = "TEXT", nullable = true)
    private String disciplinaryArea;
    @Column(name = "numero_folios", nullable = true)
    private Integer numberOfPages;
    @Column(name = "pagina_inicio", nullable = true)
    private Integer startPage;
    @Column(name = "pagina_fin", nullable = true)
    private Integer endPage;
    @Column(name = "observaciones", columnDefinition = "TEXT", nullable = true)
    private String observations;
    @Column(name = "json_datos", columnDefinition = "JSONB", nullable = false)
    @Type(JsonBinaryType.class)
    private String dataJson;
    //Relacion con tabla transversal catalogos (se deja tipo string para guardar el json)
    @Column(name = "mecanismos_publicacion_cat_id",columnDefinition = "JSONB", nullable = false)
    @Type(JsonBinaryType.class)
    private String publicationMechanism;
    //Relacion one to one con tipo_produccion
    @OneToOne
    @JoinColumn(name = "tipo_produccion_id", nullable = false)
    private TypeProductionEntity productionType;

    public ProductionEntity() {
    }

    public ProductionEntity(Long productionId, String workTitle, String disciplinaryArea, Integer numberOfPages, Integer startPage, Integer endPage, String observations, String dataJson, String publicationMechanism, TypeProductionEntity productionType) {
        this.productionId = productionId;
        this.workTitle = workTitle;
        this.disciplinaryArea = disciplinaryArea;
        this.numberOfPages = numberOfPages;
        this.startPage = startPage;
        this.endPage = endPage;
        this.observations = observations;
        this.dataJson = dataJson;
        this.publicationMechanism = publicationMechanism;
        this.productionType = productionType;
    }

    public Long getProductionId() {
        return productionId;
    }

    public void setProductionId(Long productionId) {
        this.productionId = productionId;
    }

    public String getWorkTitle() {
        return workTitle;
    }

    public void setWorkTitle(String workTitle) {
        this.workTitle = workTitle;
    }

    public String getDisciplinaryArea() {
        return disciplinaryArea;
    }

    public void setDisciplinaryArea(String disciplinaryArea) {
        this.disciplinaryArea = disciplinaryArea;
    }

    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public Integer getStartPage() {
        return startPage;
    }

    public void setStartPage(Integer startPage) {
        this.startPage = startPage;
    }

    public Integer getEndPage() {
        return endPage;
    }

    public void setEndPage(Integer endPage) {
        this.endPage = endPage;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public String getDataJson() {
        return dataJson;
    }

    public void setDataJson(String dataJson) {
        this.dataJson = dataJson;
    }

    public String getPublicationMechanism() {
        return publicationMechanism;
    }

    public void setPublicationMechanism(String publicationMechanism) {
        this.publicationMechanism = publicationMechanism;
    }

    public TypeProductionEntity getProductionType() {
        return productionType;
    }

    public void setProductionType(TypeProductionEntity productionType) {
        this.productionType = productionType;
    }
}
