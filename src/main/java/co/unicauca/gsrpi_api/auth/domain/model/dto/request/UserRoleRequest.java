package co.unicauca.gsrpi_api.auth.domain.model.dto.request;

public class UserRoleRequest {
    private RoleRequest role;

    public UserRoleRequest() {
    }

    public UserRoleRequest(RoleRequest role) {
        this.role = role;
    }

    public RoleRequest getRole() {
        return role;
    }

    public void setRole(RoleRequest role) {
        this.role = role;
    }
}
