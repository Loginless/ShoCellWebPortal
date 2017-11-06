package ua.com.shocell.controller;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GeneralDAO<T, PK extends Serializable> implements DAOInterface<T, PK> {
    private EntityManagerFactory emf = HibernateUtil.getInstance().getEntityManagerFactory();
    protected EntityManager em;
    protected CriteriaBuilder criteriaBuilder;
    public static final Logger logger = LogManager.getLogger("ShoCell");

    public GeneralDAO() {
        this.em = this.emf.createEntityManager();
        this.criteriaBuilder = HibernateUtil.getInstance().getcriteriaBuilder();
    }

    public void create(Object entity) {
        this.em.getTransaction().begin();
        this.em.persist(entity);
        this.em.getTransaction().commit();
        logger.info("asdfghjkl;");
    }

    public void createMultipleObjects(Object... entities) {
        this.em.getTransaction().begin();
        Object[] var2 = entities;
        int var3 = entities.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            Object temp = var2[var4];
            this.em.persist(temp);
        }

        this.em.getTransaction().commit();
    }

    public void update(Object entity) {
        this.em.getTransaction().begin();
        this.em.merge(entity);
        this.em.getTransaction().commit();
    }

    public void delete(Object entity) {
        this.em.getTransaction().begin();
        this.em.remove(entity);
        this.em.getTransaction().commit();
    }

    public void deleteByID(Class<T> type, PK id) {
        this.em.getTransaction().begin();
        this.em.remove(this.findByID(type, id));
        this.em.getTransaction().commit();
    }

    public T findByID(Class<T> clazz, PK id) {
        T result = this.em.find(clazz, id);
        return result;
    }

    public List<T> findAll(Class<T> type) {
        CriteriaQuery<T> criteriaQuery = HibernateUtil.getInstance().getcriteriaBuilder().createQuery(type);
        Root<T> root = criteriaQuery.from(type);
        criteriaQuery.select(root);
        TypedQuery<T> typedQuery = this.em.createQuery(criteriaQuery);
        List<T> result = typedQuery.getResultList();
        return result;
    }
}

