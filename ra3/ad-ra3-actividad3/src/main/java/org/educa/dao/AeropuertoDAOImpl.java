package org.educa.dao;

import org.educa.configuration.HibernateConfiguration;
import org.educa.entity.AeropuertoEntity;
import org.hibernate.Session;

public record AeropuertoDAOImpl() implements AeropuertoDAO {
    @Override
    public void save(AeropuertoEntity aeropuertoEntity) {
        try(Session session = HibernateConfiguration.getSessionFactory().openSession()){
            session.beginTransaction();
            session.persist(aeropuertoEntity);
            session.getTransaction().commit();
        }
    }
}
