package org.educa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="aeropuertos")
public class AeropuertoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_aeropuerto")
    private Integer idAeropuerto;
    @Column(name = "cod_iata")
    private String codIata;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "ciudad")
    private String ciudad;
    @Column(name = "pais")
    private String pais;
    @Column(name = "tasa_aero")
    private BigDecimal tasaAero;
}
