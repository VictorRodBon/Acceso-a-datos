package org.educa.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClienteEntity {
    private Long idCliente;
    private String dni;
    private String nombre;
    private String pApellido;
    private String sApellido;
    private String Telefono;
    private String email;
}
