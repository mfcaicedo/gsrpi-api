package co.unicauca.gsrpi_api.auth.domain.model;

import java.util.List;

public class Role {
    private long roleId;
    private String name;
    private String description;
    //Relacion one to many con usuarioRol
    private List<UserRole> userRoles;

    public Role() {
    }

    public Role(long roleId, String name, String description, List<UserRole> userRoles) {
        this.roleId = roleId;
        this.name = name;
        this.description = description;
        this.userRoles = userRoles;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<UserRole> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(List<UserRole> userRoles) {
        this.userRoles = userRoles;
    }
}
