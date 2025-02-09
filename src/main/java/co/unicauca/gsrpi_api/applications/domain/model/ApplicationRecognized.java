package co.unicauca.gsrpi_api.applications.domain.model;

import java.time.LocalDateTime;

public class ApplicationRecognized {
    private Long applicationRecognizedId;
    private String title;
    private String resolutionName;
    private LocalDateTime date;
    private String authors;
    private Long applicationId;
    //Relacion many to one con docente
    private Teacher teacher;

    public ApplicationRecognized() {
    }

    public ApplicationRecognized(Long applicationRecognizedId, String title, String resolutionName, LocalDateTime date, String authors, Long applicationId, Teacher teacher) {
        this.applicationRecognizedId = applicationRecognizedId;
        this.title = title;
        this.resolutionName = resolutionName;
        this.date = date;
        this.authors = authors;
        this.applicationId = applicationId;
        this.teacher = teacher;
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

    public Long getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
