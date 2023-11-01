package com.bank.bank2mjee.Services;

import com.bank.bank2mjee.Dao.AgenceDao;
import com.bank.bank2mjee.Entities.Agence;

import java.util.List;
import java.util.Optional;

public class AgenceService {
    AgenceDao agenceDao;

    public AgenceService(AgenceDao agenceDao) {
        this.agenceDao = agenceDao;
    }

    public Agence findOneAgence(String code) throws Exception {
        Optional<Agence> agenceOptional = agenceDao.findOne(code);
        if (agenceOptional.isPresent()) {
            return agenceOptional.get();
        }
        throw new Exception("Agence not found");
    }

    public List<Agence> findAllAgence() {
        return agenceDao.findAll();
    }

    public List<Agence> findAllAgenceByText(String text) {
        return agenceDao.findByAtr(text);
    }
}
