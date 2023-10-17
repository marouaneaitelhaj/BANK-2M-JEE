package com.bank.bank2mjee.Dao;

import com.bank.bank2mjee.Entities.Agence;

import java.util.Optional;

public interface AgenceDao extends CrudRepo<Agence,String> {
    Optional<Agence> update(Agence agence);
}
