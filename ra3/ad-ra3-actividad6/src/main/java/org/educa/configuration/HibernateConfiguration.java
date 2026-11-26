package org.educa.configuration;

import lombok.Getter;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateConfiguration {
    @Getter
    private static SessionFactory sessionFactory = buildSessionFactory();

    private HibernateConfiguration() throws IllegalAccessException {
        throw new IllegalAccessException();
    }

    private static SessionFactory buildSessionFactory() {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure().build();
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            return sessionFactory;
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failes" + ex);
            throw new ExceptionInInitializerError();
        }
    }


}
