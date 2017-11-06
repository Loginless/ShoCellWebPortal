package ua.com.shocell.controller;

import java.io.Serializable;
import java.util.List;

public interface DAOInterface<T, PK extends Serializable> {
    void create(T var1);

    void update(T var1);

    void delete(T var1);

    void deleteByID(Class<T> var1, PK var2);

    List<T> findAll(Class<T> var1);

    T findByID(Class<T> var1, PK var2);
}