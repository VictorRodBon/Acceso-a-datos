package org.educa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class ReservaEntity {
    private Long idReserva;
    private String nombreCliente;
    private String fechaReserva;
    private double precio;
}
