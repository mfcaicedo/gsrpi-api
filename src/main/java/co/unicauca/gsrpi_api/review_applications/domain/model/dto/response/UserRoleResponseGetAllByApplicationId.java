package co.unicauca.gsrpi_api.review_applications.domain.model.dto.response;

import co.unicauca.gsrpi_api.auth.domain.model.Role;
import co.unicauca.gsrpi_api.auth.domain.model.User;

public class UserRoleResponseGetAllByApplicationId {
    private long userRoleId;
    //Llave foranea de rol
    private RoleResponseGetAllByApplicationId role;

    public UserRoleResponseGetAllByApplicationId() {
    }

    public UserRoleResponseGetAllByApplicationId(long userRoleId, RoleResponseGetAllByApplicationId role) {
        this.userRoleId = userRoleId;
        this.role = role;
    }

    public long getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(long userRoleId) {
        this.userRoleId = userRoleId;
    }

    public RoleResponseGetAllByApplicationId getRole() {
        return role;
    }

    public void setRole(RoleResponseGetAllByApplicationId role) {
        this.role = role;
    }
}
