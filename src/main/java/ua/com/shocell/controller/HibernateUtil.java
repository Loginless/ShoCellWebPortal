package ua.com.shocell.controller;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;

public class HibernateUtil {
    private static HibernateUtil instance;
    private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");
    private CriteriaBuilder criteriaBuilder;

    private HibernateUtil() {
        this.criteriaBuilder = this.entityManagerFactory.getCriteriaBuilder();
    }

    public static HibernateUtil getInstance() {
        if (instance == null) {
            instance = new HibernateUtil();
        }

        return instance;
    }

    public EntityManagerFactory getEntityManagerFactory() {
        return this.entityManagerFactory;
    }

    public CriteriaBuilder getcriteriaBuilder() {
        return this.criteriaBuilder;
    }
}

