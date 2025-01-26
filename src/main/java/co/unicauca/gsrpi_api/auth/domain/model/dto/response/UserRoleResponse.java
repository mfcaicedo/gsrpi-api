package co.unicauca.gsrpi_api.auth.domain.model.dto.response;

import co.unicauca.gsrpi_api.auth.domain.model.Role;
import co.unicauca.gsrpi_api.auth.domain.model.User;

public class UserRoleResponse {
    private long userRoleId;
    //Llave foranea de rol
    private RoleResponse role;

    public UserRoleResponse() {
    }

    public UserRoleResponse(long userRoleId, RoleResponse role) {
        this.userRoleId = userRoleId;
        this.role = role;
    }

    public long getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(long userRoleId) {
        this.userRoleId = userRoleId;
    }

    public RoleResponse getRole() {
        return role;
    }

    public void setRole(RoleResponse role) {
        this.role = role;
    }

}
