package org.educa.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AeropuertoEntity {

    private Long id;
    private String codIata;
    private String nombre;
    private String ciudad;
    private String pais;
    private BigDecimal tasaAero;

}
