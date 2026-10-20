package org.educa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class AvionEntity {
    private Long id;
    private String matricula;
    private String modelo;
    private String fabricante;
    private Long capacidad;
}
