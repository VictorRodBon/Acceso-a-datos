package org.educa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="modelo_avion")
public class ModeloEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_modelo")
    private int idModelo;
    @Column(name = "cod_modelo")
    private String codModelo;
    @Column(name = "fabricante")
    private String fabricante;
    @Column(name = "capacidad")
    private int capacidad;

    public ModeloEntity(String codModelo, String fabricante, int capacidad) {
        this.codModelo=codModelo;
        this.fabricante=fabricante;
        this.capacidad=capacidad;
    }
}
