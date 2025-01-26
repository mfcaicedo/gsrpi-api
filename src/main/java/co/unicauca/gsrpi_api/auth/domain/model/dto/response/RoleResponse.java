package co.unicauca.gsrpi_api.auth.domain.model.dto.response;

import co.unicauca.gsrpi_api.auth.domain.model.UserRole;

import java.util.List;

public class RoleResponse {
    private long roleId;
    private String name;
    private String description;

    public RoleResponse() {
    }

    public RoleResponse(long roleId, String name, String description) {
        this.roleId = roleId;
        this.name = name;
        this.description = description;
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
}
