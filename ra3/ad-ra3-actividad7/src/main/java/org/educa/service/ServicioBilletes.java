package org.educa.service;

import org.educa.dao.BilleteDAO;
import org.educa.dao.BilleteDAOImpl;
import org.educa.entity.BilleteEntity;

public class ServicioBilletes {
    private final BilleteDAO dao = new BilleteDAOImpl();
    public BilleteEntity getBilleteById(int id){
        return dao.getBilleteById(id);
    }
}
