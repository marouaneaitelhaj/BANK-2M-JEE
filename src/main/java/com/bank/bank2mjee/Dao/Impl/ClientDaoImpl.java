package com.bank.bank2mjee.Dao.Impl;

import com.bank.bank2mjee.Dao.ClientDao;
import com.bank.bank2mjee.Entities.Client;
import com.bank.bank2mjee.Tools.SessionFactoryProvider;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Optional;

public class ClientDaoImpl implements ClientDao {
    SessionFactory sessionFactory = SessionFactoryProvider.provideSessionFactory();
    Session session = sessionFactory.openSession();

    @Override
    public Optional<Client> create(Client client) {
        return null;
    }

    @Override
    public Integer delete(String code) {
        return null;
    }

    @Override
    public Optional<Client> update(Client client) {
        return null;
    }

    @Override
    public Optional<Client> getByCode(String code) {
        return Optional.empty();
    }

    @Override
    public List<Client> getAll() {
        try {
            session.beginTransaction();
            List<Client> clients = session.createQuery("from Client").getResultList();
            session.getTransaction().commit();
            return clients;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
