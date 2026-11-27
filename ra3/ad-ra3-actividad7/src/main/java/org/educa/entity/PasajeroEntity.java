package org.educa.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pasajeros")
public class PasajeroEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pasajero")
    private int idPasajero;

    @Column(name = "id_reserva")
    private String idReserva;

    @Column(name = "dni")
    private String dni;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "p_apellido")
    private String pApellido;

    @Column(name = "s_apellido")
    private String sApellido;

    @Column(name = "email")
    private String email;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "fec_nac")
    private String fecNac;

    @OneToMany(mappedBy = "pasajero", cascade = CascadeType.ALL)
    private List<BilleteEntity> billetes;
}