package ua.com.shocell.controller;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class GeneralDAO<T, PK extends Serializable> implements DAOInterface<T, PK> {

    @PersistenceContext
    EntityManager em;
    
    CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
    Logger logger;


    public GeneralDAO() {
    }

    public void create(Object entity) {
        em.persist(entity);
        logger.info("Object created;");
    }

    public void createMultipleObjects(Object... entities) {
        Object[] var2 = entities;
        int var3 = entities.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            Object temp = var2[var4];
            em.persist(temp);
        }
    }

    public void update(Object entity) {
        em.merge(entity);
    }

    public void delete(Object entity) {
        em.remove(entity);
    }

    public void deleteByID(Class<T> type, PK id) {
        em.remove(this.findByID(type, id));
    }

    public T findByID(Class<T> clazz, PK id) {
        T result = em.find(clazz, id);
        return result;
    }

    public List<T> findAll(Class<T> type) {
        CriteriaQuery<T> criteriaQuery = criteriaBuilder.createQuery(type);
        Root<T> root = criteriaQuery.from(type);
        criteriaQuery.select(root);
        TypedQuery<T> typedQuery = this.em.createQuery(criteriaQuery);
        List<T> result = typedQuery.getResultList();
        return result;
    }
}

