package org.educa.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BilleteEntity {

    private Long idBillete;
    private PasajeroEntity pasajeroEntity;
    private VueloEntity vueloEntity;
    private AsientoEntity asientoEntity;
    private BigDecimal precio;
}
