package co.unicauca.gsrpi_api.auth.domain.model;

import jakarta.persistence.OneToMany;

import java.util.List;

public class User {
    long userId;
    String uid;
    String username;
    String email;
    String password;

    //Relacion uno a muchos con UserRoleEntity
    List<UserRole> userRoles;

    public User() {
    }

    public User(long userId, String uid, String username, String email, String password, List<UserRole> userRoles) {
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

    public List<UserRole> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(List<UserRole> userRoles) {
        this.userRoles = userRoles;
    }
}
