package org.educa.dao;

import org.educa.configuration.HibernateConfiguration;
import org.educa.entity.ClienteEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ClienteDAOImpl implements ClienteDAO {
    @Override
    public void crear(ClienteEntity cliente) {
        try(Session session= HibernateConfiguration.getSessionFactory().openSession()){
            if (cliente!=null) {
                session.beginTransaction();
                session.persist(cliente);
                session.getTransaction().commit();
            }
        }
    }

    @Override
    public void update(int id, String nombre) {
        Transaction tx = null;
        try (Session session = HibernateConfiguration.getSessionFactory().openSession()) {
            tx = session.beginTransaction();

            ClienteEntity cliente = session.get(ClienteEntity.class, id);
            if (cliente == null) {
                System.out.println("No existe ningún cliente con el id " + id);
                tx.rollback();
                return;
            }

            cliente.setNombre(nombre);
            tx.commit();
        } catch (Exception e) {
            if (tx != null && tx.getStatus().canRollback()) {
                tx.rollback();
            }
            throw e;
        }
    }
}
