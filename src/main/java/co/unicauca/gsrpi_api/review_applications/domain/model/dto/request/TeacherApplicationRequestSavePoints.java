package co.unicauca.gsrpi_api.review_applications.domain.model.dto.request;

public class TeacherApplicationRequestSavePoints {
    private Long teacherApplicationId;
    private short recommendedPoints;
    private short assignedPoints;

    public TeacherApplicationRequestSavePoints() {
    }

    public TeacherApplicationRequestSavePoints(Long teacherApplicationId, short recommendedPoints, short assignedPoints) {
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

    public short getRecommendedPoints() {
        return recommendedPoints;
    }

    public void setRecommendedPoints(short recommendedPoints) {
        this.recommendedPoints = recommendedPoints;
    }

    public short getAssignedPoints() {
        return assignedPoints;
    }

    public void setAssignedPoints(short assignedPoints) {
        this.assignedPoints = assignedPoints;
    }
}
