package org.educa.dao;

import org.educa.configuration.HibernateConfiguration;
import org.educa.entity.ModeloEntity;
import org.hibernate.Session;

public class ModeloDAOImpl implements ModeloDAO {
    @Override
    public void create(ModeloEntity modelo) {
        try(Session session = HibernateConfiguration.getSessionFactory().openSession()){
            session.beginTransaction();
            session.persist(modelo);
            session.getTransaction().commit();
        }
    }
}
