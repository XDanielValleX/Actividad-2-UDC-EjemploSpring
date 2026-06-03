package mintic.misiontic.ciclo3.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "usuario")
@Data
public class Usuario {

    @Id
    @Column(name = "cedula")
    private String cedula;

    @Column(name = "clave")
    private String clave;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "email")
    private String email;
}
