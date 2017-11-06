package ua.com.shocell.controller;

import java.util.List;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import ua.com.shocell.model.Abonents;

public class DAOAbonImpl extends GeneralDAO {
    public DAOAbonImpl() {
    }

    public List<Abonents> getByMobileNumber(Long mobNumber) {
        CriteriaQuery<Abonents> criteriaQuery = this.criteriaBuilder.createQuery(Abonents.class);
        Root<Abonents> root = criteriaQuery.from(Abonents.class);
        criteriaQuery.select(root);
        criteriaQuery.where(this.criteriaBuilder.equal(root.get(Abonents_.mobileNumber), mobNumber));
        TypedQuery<Abonents> typedQuery = this.em.createQuery(criteriaQuery);
        List<Abonents> result = typedQuery.getResultList();
        return result;
    }

    public void deleteByMobNumber(Long mobNumber) {
        CriteriaQuery<Abonents> criteriaQuery = this.criteriaBuilder.createQuery(Abonents.class);
        Root<Abonents> root = criteriaQuery.from(Abonents.class);
        criteriaQuery.select(root);
        criteriaQuery.where(this.criteriaBuilder.equal(root.get(Abonents_.mobileNumber), mobNumber));
        TypedQuery<Abonents> typedQuery = this.em.createQuery(criteriaQuery);
        List<Abonents> result = typedQuery.getResultList();
        this.em.getTransaction().begin();
        this.em.remove(result.get(0));
        this.em.getTransaction().commit();
    }
}

