package co.unicauca.gsrpi_api.review_applications.domain.model.dto.response;

public class TeacherApplicationResponseGetPoints {
    private Double recommendedPoints;
    private Double assignedPoints;

    public TeacherApplicationResponseGetPoints() {
    }

    public TeacherApplicationResponseGetPoints(Double recommendedPoints, Double assignedPoints) {
        this.recommendedPoints = recommendedPoints;
        this.assignedPoints = assignedPoints;
    }

    public Double getRecommendedPoints() {
        return recommendedPoints;
    }

    public void setRecommendedPoints(Double recommendedPoints) {
        this.recommendedPoints = recommendedPoints;
    }

    public Double getAssignedPoints() {
        return assignedPoints;
    }

    public void setAssignedPoints(Double assignedPoints) {
        this.assignedPoints = assignedPoints;
    }
}
