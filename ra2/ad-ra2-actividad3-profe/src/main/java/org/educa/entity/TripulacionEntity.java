package org.educa.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TripulacionEntity {

    private Long idEmpleado;
    private String licencia;
    private String nombre;
    private String pApellido;
    private String sApellido;
    private String rol;
    private List<VueloEntity> vueloEntities;
    private List<ModeloAvionEntity> habilitaciones;
}
