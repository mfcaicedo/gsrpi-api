package co.unicauca.gsrpi_api.auth.domain.model.dto.response;

import co.unicauca.gsrpi_api.auth.domain.model.UserRole;

import java.util.List;

public class UserResponse {
    long userId;
    String uid;
    String username;
    String email;
    String password;
    //Relacion uno a muchos con UserRoleEntity
    List<UserRoleResponse> userRoles;

    public UserResponse() {
    }

    public UserResponse(long userId, String uid, String username, String email, String password, List<UserRoleResponse> userRoles) {
        this.userId = userId;
        this.uid = uid;
        this.username = username;
        this.email = email;
        this.password = password;
        this.userRoles = userRoles;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<UserRoleResponse> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(List<UserRoleResponse> userRoles) {
        this.userRoles = userRoles;
    }
}
