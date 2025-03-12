package co.unicauca.gsrpi_api.review_applications.domain.model.dto.response;

import co.unicauca.gsrpi_api.auth.domain.model.UserRole;

import java.util.List;

public class UserResponseGetAllByApplicationId {
    long userId;
    //Relacion uno a muchos con UserRoleEntity
    List<UserRoleResponseGetAllByApplicationId> userRoles;

    public UserResponseGetAllByApplicationId() {
    }

    public UserResponseGetAllByApplicationId(long userId, List<UserRoleResponseGetAllByApplicationId> userRoles) {
        this.userId = userId;
        this.userRoles = userRoles;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public List<UserRoleResponseGetAllByApplicationId> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(List<UserRoleResponseGetAllByApplicationId> userRoles) {
        this.userRoles = userRoles;
    }
}
