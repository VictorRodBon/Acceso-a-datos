package org.educa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "reservas")
public class ReservaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reserva")
    private String idReserva;
    @Column(name = "cod_reserva")
    private String codReserva;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_cliente")
    private ClienteEntity cliente;
    @Column(name = "fec_reserva")
    private String fecReserva;
    @Column(name = "estado")
    private String estado;
}
