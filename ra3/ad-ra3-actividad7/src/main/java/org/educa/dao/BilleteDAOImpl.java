package org.educa.dao;

import org.educa.configuration.HibernateConfiguration;
import org.educa.entity.BilleteEntity;
import org.hibernate.Session;

public class BilleteDAOImpl implements BilleteDAO {
    @Override
    public BilleteEntity getBilleteById(int id) {
        try (Session session = HibernateConfiguration.getSessionFactory().openSession()) {
            session.beginTransaction();

            BilleteEntity billete = session.get(BilleteEntity.class, id);
            if (billete != null) {
                org.hibernate.Hibernate.initialize(billete.getPasajero());
                org.hibernate.Hibernate.initialize(billete.getVuelo());
            }

            return billete;
        }
    }
}
