package org.educa.dao;

import org.educa.entity.AeropuertoEntity;
import org.educa.entity.BilleteEntity;
import org.educa.entity.VueloEntity;

import java.sql.SQLException;
import java.util.List;

public interface DaoInterface {
<<<<<<< HEAD
    Object obtenerObjetos(String tabla) throws SQLException;
=======
    AeropuertoEntity obtenerPorCiudad(String ciudad);

    List<VueloEntity> obtenerVuelosPorOrigen(int idAeropuertoOrigen);

    List<BilleteEntity> obtenerBilletesPorVuelo(int idVuelo);
    void actualizar(BilleteEntity billete);
>>>>>>> 2c600a2d49235e87798e4aaa2dbba647aed1058c
}
