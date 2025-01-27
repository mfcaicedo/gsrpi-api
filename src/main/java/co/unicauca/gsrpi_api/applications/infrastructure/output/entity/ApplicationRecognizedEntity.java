package co.unicauca.gsrpi_api.applications.infrastructure.output.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "solicitud_reconocida")
public class ApplicationRecognizedEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "solicitud_reconocida_id")
    private Long applicationRecognizedId;
    @Column(name = "titulo_trabajo", columnDefinition = "TEXT", nullable = false)
    private String title;
    @Column(name = "nombre_resolucion", columnDefinition = "TEXT", nullable = true)
    private String resolutionName;
    @Column(name = "fecha", columnDefinition = "TIMESTAMP", nullable = false)
    private LocalDateTime date;
    @Column(name = "autores", columnDefinition = "TEXT", nullable = false)
    private String authors;

    //Relacion many to one con docente
    @ManyToOne
    @JoinColumn(name = "docente_id", nullable = false)
    private TeacherEntity teacher;

    public ApplicationRecognizedEntity() {
    }

    public ApplicationRecognizedEntity(Long applicationRecognizedId, String title, String resolutionName, LocalDateTime date, String authors) {
        this.applicationRecognizedId = applicationRecognizedId;
        this.title = title;
        this.resolutionName = resolutionName;
        this.date = date;
        this.authors = authors;
    }

    public Long getApplicationRecognizedId() {
        return applicationRecognizedId;
    }

    public void setApplicationRecognizedId(Long applicationRecognizedId) {
        this.applicationRecognizedId = applicationRecognizedId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getResolutionName() {
        return resolutionName;
    }

    public void setResolutionName(String resolutionName) {
        this.resolutionName = resolutionName;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }
}
