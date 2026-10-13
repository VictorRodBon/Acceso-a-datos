package org.educa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PasajeroEntity {
    private Long idPasajero;
    private ReservaEntity reservaEntity;
    private String dni;
    private String nombre;
    private String pApellido;
    private String sApellido;
    private String email;
    private String telefono;
    private LocalDate fecNac;
}
