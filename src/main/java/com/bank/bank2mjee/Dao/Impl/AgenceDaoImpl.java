package com.bank.bank2mjee.Dao.Impl;

import com.bank.bank2mjee.Dao.AgenceDao;
import com.bank.bank2mjee.Entities.Agence;
import com.bank.bank2mjee.Entities.Client;
import com.bank.bank2mjee.Tools.SessionFactoryProvider;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class AgenceDaoImpl implements AgenceDao {
    SessionFactory sessionFactory = SessionFactoryProvider.provideSessionFactory();
    Session session = sessionFactory.openSession();
    @Override
    public Optional<Agence> save(Agence agence) {
        return Optional.empty();
    }

    @Override
    public Optional<Agence> update(Agence agence, String s) {
        return Optional.empty();
    }


    @Override
    public Optional<Agence> update(Agence agence) {
        return Optional.empty();
    }

    @Override
    public List<Agence> findByAtr(String text) {
        try {
            session.beginTransaction();
            Query<Agence> query = session.createQuery("from Agence where code like :text OR nom like :text OR adresse like :text OR numero like :text", Agence.class);
            query.setParameter("text", "%" + text + "%");
            List<Agence> agences = query.list();
            session.getTransaction().commit();
            return agences;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        return Collections.emptyList();
    }

    @Override
    public int delete(String s) {
        return 0;
    }

    @Override
    public Optional<Agence> findOne(String s) {
        return null;
    }

    @Override
    public List<Agence> findAll() {
        try {
            session.beginTransaction();
            List<Agence> agences = session.createQuery("from Client").getResultList();
            session.getTransaction().commit();
            return agences;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
