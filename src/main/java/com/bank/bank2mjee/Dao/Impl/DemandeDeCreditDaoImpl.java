package com.bank.bank2mjee.Dao.Impl;

import com.bank.bank2mjee.Dao.DemandeDeCreditDao;
import com.bank.bank2mjee.Entities.DemandeDeCredit;
import com.bank.bank2mjee.Tools.SessionFactoryProvider;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;
import java.util.Optional;

public class DemandeDeCreditDaoImpl implements DemandeDeCreditDao {
    SessionFactory sessionFactory = SessionFactoryProvider.provideSessionFactory();
    Session session = sessionFactory.openSession();
    @Override
    public Optional<DemandeDeCredit> save(DemandeDeCredit demandeDeCredit) {
        try {
            session.beginTransaction();
            session.persist(demandeDeCredit);
            session.getTransaction().commit();
            return Optional.ofNullable(demandeDeCredit);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Optional<DemandeDeCredit> update(DemandeDeCredit demandeDeCredit) {
        try {
            session.beginTransaction();
            DemandeDeCredit credit = session.find(DemandeDeCredit.class, demandeDeCredit);

            session.getTransaction().commit();
            return Optional.ofNullable(demandeDeCredit);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public int delete(Integer integer) {
        return 0;
    }

    @Override
    public DemandeDeCredit findOne(Integer integer) {
        return null;
    }

    @Override
    public List<DemandeDeCredit> findAll() {
        return null;
    }
}
