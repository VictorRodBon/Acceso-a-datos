package org.educa.dao;

import org.educa.entity.AeropuertoEntity;
import org.educa.entity.BilleteEntity;
import org.educa.entity.VueloEntity;

import java.sql.SQLException;
import java.util.List;

public interface DaoInterface {
    AeropuertoEntity obtenerPorCiudad(String ciudad);

    List<VueloEntity> obtenerVuelosPorOrigen(int idAeropuertoOrigen);

    List<BilleteEntity> obtenerBilletesPorVuelo(int idVuelo);
    void actualizar(BilleteEntity billete);
}
