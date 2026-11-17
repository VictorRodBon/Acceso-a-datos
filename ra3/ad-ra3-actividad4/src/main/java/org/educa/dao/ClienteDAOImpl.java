package org.educa.dao;

import org.educa.configuration.HibernateConfiguration;
import org.educa.entity.ClienteEntity;
import org.hibernate.Session;

public record ClienteDAOImpl() implements ClienteDAO {
    @Override
    public ClienteEntity get(Integer id) {
        try (Session session = HibernateConfiguration.getSessionFactory().openSession()){
            return session.get(ClienteEntity.class, id);
        }
    }
}
