package co.unicauca.gsrpi_api.user_management.infrastructure.adapter.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "usuario")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usuario_id")
    long user_id;
    @Column(name = "nombre_usuario")
    String username;
    @Column(name = "correo")
    String email;
    @Column(name = "contrasenia")
    String password;
}
