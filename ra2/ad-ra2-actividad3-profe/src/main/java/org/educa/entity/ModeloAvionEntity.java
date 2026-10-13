package org.educa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ModeloAvionEntity {

    private Long idModelo;
    private String codModelo;
    private String fabricante;
    private Integer capacidad;
    private List<TripulacionEntity> tripulacionEntityHabilitada;
}
