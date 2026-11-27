package org.educa.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "vuelos")
public class VueloEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vuelo")
    private int idVuelo;

    @Column(name = "num_vuelo")
    private String numVuelo;

    @Column(name = "id_origen")
    private int idOrigen;

    @Column(name = "id_destino")
    private int idDestino;

    @Column(name = "id_avion")
    private int idAvion;

    @Column(name = "fec_salida")
    private Timestamp fecSalida;

    @Column(name = "fec_llegada")
    private Timestamp fecLlegada;

    @Column(name = "duracion")
    private LocalTime duracion;

    @Column(name = "coste_extra")
    private int costeExtra;

    @Column(name = "estado")
    private String estado;

    @OneToMany(mappedBy = "vuelo", cascade = CascadeType.ALL)
    private List<BilleteEntity> billetes;
}
