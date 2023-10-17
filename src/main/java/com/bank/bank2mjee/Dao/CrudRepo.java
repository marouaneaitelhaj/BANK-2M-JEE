package com.bank.bank2mjee.Dao;

import java.util.List;

public interface CrudRepo<M, T> {
    M save(M m);

    M update(M m);

    int delete(T t);

    M findOne(T t);

    List<M> findAll();
}
