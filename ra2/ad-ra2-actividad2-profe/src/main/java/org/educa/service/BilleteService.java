package org.educa.service;

import org.educa.dao.BilleteDAO;
import org.educa.dao.BilleteDAOImpl;
import org.educa.entity.BilleteEntity;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class BilleteService {
    private final BilleteDAO billeteDAO = new BilleteDAOImpl();

    public void discountPerOriginAirport(String origin, BigDecimal discount) {
        List<BilleteEntity> billetes = billeteDAO.findBilletesByOriginAirport(origin);

        BigDecimal discountPercentage = discount.divide(new BigDecimal("100"));
        for (BilleteEntity billete : billetes) {
            billete.setPrecio(billete.getPrecio().subtract(
                            billete.getPrecio().multiply(discountPercentage))
                    .setScale(2, RoundingMode.HALF_UP));
            billeteDAO.updatePrecio(billete);
        }
    }

}