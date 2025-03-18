package co.unicauca.gsrpi_api.review_applications.domain.model.dto.request;

public class TeacherApplicationRequestSavePoints {
    private Long teacherApplicationId;
    private Double recommendedPoints;
    private Double assignedPoints;

    public TeacherApplicationRequestSavePoints() {
    }

    public TeacherApplicationRequestSavePoints(Long teacherApplicationId, Double recommendedPoints, Double assignedPoints) {
        this.teacherApplicationId = teacherApplicationId;
        this.recommendedPoints = recommendedPoints;
        this.assignedPoints = assignedPoints;
    }

    public Long getTeacherApplicationId() {
        return teacherApplicationId;
    }

    public void setTeacherApplicationId(Long teacherApplicationId) {
        this.teacherApplicationId = teacherApplicationId;
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
