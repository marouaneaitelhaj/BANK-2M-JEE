package com.bank.bank2mjee.Dao.Impl;

import com.bank.bank2mjee.Dao.ClientDao;
import com.bank.bank2mjee.Entities.Client;
import com.bank.bank2mjee.Tools.SessionFactoryProvider;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Optional;

public class ClientDaoImpl implements ClientDao {
    SessionFactory sessionFactory = SessionFactoryProvider.provideSessionFactory();
    Session session = sessionFactory.openSession();

    @Override
    public Optional<Client> save(Client client) {
        try {
            session.beginTransaction();
            session.persist(client);
            session.getTransaction().commit();
            sessionFactory.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Optional<Client> update(Client client, String code) {
        try {
            session.beginTransaction();
            Client updateClient = new Client();
            updateClient = session.get(Client.class, code);
            if (updateClient != null){
                updateClient.setAddress(client.getAddress());
                updateClient.setMobile(client.getMobile());
                updateClient.setFirstName(client.getFirstName());
                updateClient.setLastName(client.getLastName());
                updateClient.setBirthDate(client.getBirthDate());
                session.persist(updateClient);
                session.getTransaction().commit();
                sessionFactory.close();
                return Optional.of(updateClient);
            }else {
                session.getTransaction().commit();
                sessionFactory.close();
                return Optional.empty();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return Optional.empty();
    }

    @Override
    public int delete(String code) {
        try {
            session.beginTransaction();
            Client client = new Client();
            client = session.get(Client.class, code);
            session.remove(client);
            session.getTransaction().commit();
            sessionFactory.close();
            return 1;
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public Optional<Client> findOne(String s) {
        try {
            session.beginTransaction();
            Client client = new Client();
            client = session.get(Client.class, s);
            return Optional.of(client);
        }catch (Exception e){
            e.printStackTrace();
        }
        return Optional.empty();
    }

    @Override
    public List<Client> findAll() {
        try {
            session.beginTransaction();
            List<Client> clients = session.createQuery("from Client").getResultList();
            session.getTransaction().commit();
            sessionFactory.close();
            return clients;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Optional<Client> findByAtr(String text) {
        try {
            session.beginTransaction();
            Client client = new Client();
            Query<Client> query = session.createQuery("from Client where firstName like :text OR lastName like :text OR mobile like :text OR code like :text OR address like :text", Client.class);
            query.setParameter("name", "%" + text + "%");
            client = query.uniqueResult();
            session.getTransaction().commit();
            sessionFactory.close();
            return Optional.of(client);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }
}
