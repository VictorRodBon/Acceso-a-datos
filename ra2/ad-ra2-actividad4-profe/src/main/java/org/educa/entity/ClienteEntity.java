package org.educa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClienteEntity {
    private Long idCliente;
    private String dni;
    private String nombre;
    private String pApellido;
    private String sApellido;
    private String email;
    private String telefono;
    private Integer numReservas;
}
