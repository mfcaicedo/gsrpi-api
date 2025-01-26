package co.unicauca.gsrpi_api.auth.infrastructure.output.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "usuario_rol")
public class UserRoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usuario_rol_id")
    private long userRoleId;
    //Llave foranea de rol
    @ManyToOne
    @JoinColumn(name = "rol_id", nullable = false)
    private RoleEntity role;
    //Llave foranea de usuario
    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private UserEntity user;

    public UserRoleEntity() {
    }

    public UserRoleEntity(RoleEntity roleEntity, UserEntity userEntity) {
        this.role = roleEntity;
        this.user = userEntity;
    }

    public long getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(long userRoleId) {
        this.userRoleId = userRoleId;
    }

    public RoleEntity getRole() {
        return role;
    }

    public void setRole(RoleEntity roleEntity) {
        this.role = roleEntity;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity userEntity) {
        this.user = userEntity;
    }
}
