package org.educa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AsientoEntity {
    private Long idAsiento;
    private AvionEntity avionEntity;
    private String codAsiento;
    private String clase;
}
