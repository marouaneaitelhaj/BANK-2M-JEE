package com.bank.bank2mjee.Services;

import com.bank.bank2mjee.Dao.ClientDao;
import com.bank.bank2mjee.Entities.Agence;
import com.bank.bank2mjee.Entities.Client;

import java.util.List;

public class SimulationService {

    ClientDao clientDao;

    public SimulationService(ClientDao clientDao) {
        this.clientDao = clientDao;
    }

    public List<Agence> findAllAgence() {
        return null;
    }

    public List<Client> findAllClient() {
        return clientDao.getAll();
    }
}
