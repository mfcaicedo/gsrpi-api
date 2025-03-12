package co.unicauca.gsrpi_api.review_applications.domain.model.dto.response;

public class RoleResponseGetAllByApplicationId {
    private long roleId;
    private String name;

    public RoleResponseGetAllByApplicationId() {
    }

    public RoleResponseGetAllByApplicationId(long roleId, String name) {
        this.roleId = roleId;
        this.name = name;
    }

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
