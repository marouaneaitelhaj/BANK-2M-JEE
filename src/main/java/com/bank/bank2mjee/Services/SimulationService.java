package com.bank.bank2mjee.Services;

import com.bank.bank2mjee.Dao.AgenceDao;
import com.bank.bank2mjee.Dao.ClientDao;
import com.bank.bank2mjee.Entities.Agence;
import com.bank.bank2mjee.Entities.Client;

import java.util.List;

public class SimulationService {

    ClientDao clientDao;
    AgenceDao agenceDao;

    public SimulationService(ClientDao clientDao, AgenceDao agenceDao) {
        this.clientDao = clientDao;
        this.agenceDao = agenceDao;
    }

    public List<Agence> findAllAgence() {
        return agenceDao.findAll();
    }

    public List<Client> findAllClient() {
        return clientDao.findAll();
    }
}
