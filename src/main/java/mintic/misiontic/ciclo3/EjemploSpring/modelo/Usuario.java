package mintic.misiontic.ciclo3.EjemploSpring.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Entity
@Table(name = "usuario")
@Data
public class Usuario {

    @Id
    @NotEmpty
    @Column(name = "cedula")
    private String cedula;

    @NotEmpty
    @Column(name = "clave")
    private String clave;

    @NotEmpty
    @Column(name = "nombre")
    private String nombre;

    @NotEmpty
    @Email
    @Column(name = "email")
    private String email;
}
