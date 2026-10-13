package org.educa.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservaEntity {
    private Long idReserva;
    private String codReserva;
    private ClienteEntity clienteEntity;
    private LocalDate fecReserva;
    private String estado;
}
