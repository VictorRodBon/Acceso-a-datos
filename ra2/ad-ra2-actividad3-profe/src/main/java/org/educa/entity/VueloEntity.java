package org.educa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VueloEntity {
    private Long idVuelo;
    private String numVuelo;
    private AeropuertoEntity origen;
    private AeropuertoEntity destino;
    private AvionEntity avionEntity;
    private LocalDate fecSalida;
    private LocalDate fecLlegada;
    private Integer duracion;
    private BigDecimal costeExtra;
    private String estado;
    private List<TripulacionEntity> tripulacionEntity;
}
