package co.unicauca.gsrpi_api.auth.infrastructure.output.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usuario_id")
    long userId;
    @Column(name = "uid",columnDefinition = "TEXT", nullable = false, unique = true)
    String uid;
    @Column(name = "nombre_usuario", columnDefinition = "TEXT", nullable = true)
    String username;
    @Column(name = "correo", columnDefinition = "TEXT", nullable = false, unique = true)
    String email;
    @Column(name = "contrasenia", columnDefinition = "TEXT", nullable = true)
    String password;

    public UserEntity() {
    }
    public UserEntity(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public UserEntity(long userId, String username, String email, String password) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public UserEntity(long userId, String uid, String username, String email, String password) {
        this.userId = userId;
        this.uid = uid;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
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

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}
