package co.unicauca.gsrpi_api.auth.domain.model.dto.request;

import co.unicauca.gsrpi_api.auth.domain.model.UserRole;

import java.util.List;

public class UserRequest {
    String uid;
    String email;
    String password;
    List<UserRoleRequest> userRoles;

    public UserRequest() {
    }

    public UserRequest(String uid, String email, String password, List<UserRoleRequest> userRoles) {
        this.uid = uid;
        this.email = email;
        this.password = password;
        this.userRoles = userRoles;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
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

    public List<UserRoleRequest> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(List<UserRoleRequest> userRoles) {
        this.userRoles = userRoles;
    }
}
