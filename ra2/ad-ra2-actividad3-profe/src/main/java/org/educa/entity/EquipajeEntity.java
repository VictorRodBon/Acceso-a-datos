package org.educa.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EquipajeEntity {
    private Long idEquipaje;
    private BilleteEntity billeteEntity;
    private BigDecimal peso;
    private String tipo;
}
