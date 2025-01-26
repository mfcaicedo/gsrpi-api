package co.unicauca.gsrpi_api.auth.domain.model;

public class UserRole {
    private long userRoleId;
    //Llave foranea de rol
    private Role role;
    //Llave foranea de usuario
    private User user;

    public UserRole() {
    }

    public UserRole(long userRoleId, Role role, User user) {
        this.userRoleId = userRoleId;
        this.role = role;
        this.user = user;
    }

    public long getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(long userRoleId) {
        this.userRoleId = userRoleId;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
