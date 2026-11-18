package org.educa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ModeloEntity {
    int id_modelo;
    String codModelo;
    String fabricante;
    int capacidad;
}