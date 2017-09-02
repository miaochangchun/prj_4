package com.miao.test.repository;

import java.io.Serializable;
import java.util.List;

/**
 * Created by 10048 on 2017/9/2.
 */
public interface DomainRepository<T, PK extends Serializable> {
    T load(PK id);

    T get(PK id);

    List<T> findAll();

    void persist(T entity);

    PK save(T Entity);

    void saveOrUpdate(T entity);

    void delete(PK id);

    void flush();

}
