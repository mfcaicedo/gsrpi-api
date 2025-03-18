package co.unicauca.gsrpi_api.review_applications.domain.model.dto.response;

public class TeacherApplicationResponse {
    private Long teacherApplicationId;

    public TeacherApplicationResponse() {
    }

    public TeacherApplicationResponse(Long teacherApplicationId) {
        this.teacherApplicationId = teacherApplicationId;
    }

    public Long getTeacherApplicationId() {
        return teacherApplicationId;
    }

    public void setTeacherApplicationId(Long teacherApplicationId) {
        this.teacherApplicationId = teacherApplicationId;
    }
}
