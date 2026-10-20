package org.educa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteEntity {

    private Long idCliente;
    private String dni;
    private String nombre;
    private String pApellido;
    private String sApellido;
    private String email;
    private String telefono;

    public ClienteEntity(String dni, String nombre, String pApellido, String sApellido, String email, String telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.pApellido = pApellido;
        this.sApellido = sApellido;
        this.email = email;
        this.telefono = telefono;
    }
}
