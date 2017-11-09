package ua.com.shocell.controller;

import java.util.List;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Component;
import ua.com.shocell.model.Abonents;
import ua.com.shocell.model.Abonents_;

@Component
public class DAOAbonImpl extends GeneralDAO {
    public DAOAbonImpl() {
    }

    public List<Abonents> getByMobileNumber(Long mobNumber) {
        CriteriaQuery<Abonents> criteriaQuery = criteriaBuilder.createQuery(Abonents.class);
        Root<Abonents> root = criteriaQuery.from(Abonents.class);
        criteriaQuery.select(root);
        criteriaQuery.where(criteriaBuilder.equal(root.get(Abonents_.mobileNumber), mobNumber));
        TypedQuery<Abonents> typedQuery = em.createQuery(criteriaQuery);
        List<Abonents> result = typedQuery.getResultList();
        return result;
    }
//
    public void deleteByMobNumber(Long mobNumber) {
        CriteriaQuery<Abonents> criteriaQuery = criteriaBuilder.createQuery(Abonents.class);
        Root<Abonents> root = criteriaQuery.from(Abonents.class);
        criteriaQuery.select(root);
        criteriaQuery.where(criteriaBuilder.equal(root.get(Abonents_.mobileNumber), mobNumber));
        TypedQuery<Abonents> typedQuery = em.createQuery(criteriaQuery);
        List<Abonents> result = typedQuery.getResultList();
        em.getTransaction().begin();
        em.remove(result.get(0));
        em.getTransaction().commit();
    }
}

