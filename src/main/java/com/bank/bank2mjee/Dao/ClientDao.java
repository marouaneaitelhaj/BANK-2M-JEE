package com.bank.bank2mjee.Dao;

import com.bank.bank2mjee.Entities.Client;

import java.util.List;
import java.util.Optional;

public interface ClientDao {
    Optional<Client> create(Client client);
    Integer delete(String code);
    Optional<Client> update(Client client);
    Optional<Client> getByCode(String code);
    List<Client> getAll();
}
