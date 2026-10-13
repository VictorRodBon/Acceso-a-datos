package org.educa.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AvionEntity {
    private Long idAvion;
    private String matricula;
    private ModeloAvionEntity modelo;
    private BigDecimal costeFlete;
    private BigDecimal consumoHora;
    private String estado;
}