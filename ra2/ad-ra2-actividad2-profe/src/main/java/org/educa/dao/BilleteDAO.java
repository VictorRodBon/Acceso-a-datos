package org.educa.dao;

import org.educa.entity.BilleteEntity;

import java.util.List;

public interface BilleteDAO {

    List<BilleteEntity> findBilletesByOriginAirport(String origin);

    void updatePrecio(BilleteEntity billete);
}
