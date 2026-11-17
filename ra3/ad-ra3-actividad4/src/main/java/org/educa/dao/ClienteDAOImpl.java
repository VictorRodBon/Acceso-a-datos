package org.educa.dao;

import org.educa.configuration.HibernateConfiguration;
import org.educa.entity.ClienteEntity;
import org.hibernate.Hibernate;
import org.hibernate.Session;

public class ClienteDAOImpl implements ClienteDAO {
    @Override
    public ClienteEntity get(Integer id) {
        try (Session session = HibernateConfiguration.getSessionFactory().openSession()) {
            ClienteEntity cliente = session.get(ClienteEntity.class, id);

            if (cliente != null) {
                // Carga las reservas antes de que se cierre la sesión
                Hibernate.initialize(cliente.getReservas());
            }

            return cliente;
        }
    }
}
