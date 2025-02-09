package co.unicauca.gsrpi_api.applications.domain.model.dto.response;

import java.time.LocalDateTime;

public class ApplicationRecognizedResponseGetByApplicationId {
    private Long applicationRecognizedId;
    private String title;
    private String resolutionName;
    private LocalDateTime date;
    private String authors;
    private Long applicationId;

    public ApplicationRecognizedResponseGetByApplicationId() {
    }

    public ApplicationRecognizedResponseGetByApplicationId(Long applicationRecognizedId, String title, String resolutionName, LocalDateTime date, String authors, Long applicationId) {
        this.applicationRecognizedId = applicationRecognizedId;
        this.title = title;
        this.resolutionName = resolutionName;
        this.date = date;
        this.authors = authors;
        this.applicationId = applicationId;
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
}
