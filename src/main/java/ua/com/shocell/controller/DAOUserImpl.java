package ua.com.shocell.controller;

import java.util.List;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Component;
import ua.com.shocell.model.WebUsers;
import ua.com.shocell.model.WebUsers_;

@Component
public class DAOUserImpl extends GeneralDAO {
    public DAOUserImpl() {
    }

    public boolean uniqLogin(String login) {
        CriteriaQuery<WebUsers> criteriaQuery = criteriaBuilder.createQuery(WebUsers.class);
        Root<WebUsers> root = criteriaQuery.from(WebUsers.class);
        criteriaQuery.select(root);
        criteriaQuery.where(criteriaBuilder.equal(root.get(WebUsers_.login), login));
        TypedQuery<WebUsers> typedQuery = em.createQuery(criteriaQuery);
        List<WebUsers> resultList = typedQuery.getResultList();
        return resultList.isEmpty();
    }

    public boolean LoginPasswordMatch(String login, String password) {
        CriteriaQuery<WebUsers> criteriaQuery = criteriaBuilder.createQuery(WebUsers.class);
        Root<WebUsers> root = criteriaQuery.from(WebUsers.class);
        criteriaQuery.select(root);
        criteriaQuery.where(criteriaBuilder.equal(root.get(WebUsers_.login), login));
        TypedQuery<WebUsers> typedQueryLogin = em.createQuery(criteriaQuery);
        List<WebUsers> resultListLogin = typedQueryLogin.getResultList();
        criteriaQuery.where(criteriaBuilder.equal(root.get(WebUsers_.password), password));
        TypedQuery<WebUsers> typedQueryPassword = em.createQuery(criteriaQuery);
        List<WebUsers> resultListPassword = typedQueryPassword.getResultList();
        return resultListLogin.equals(login) && resultListPassword.equals(password);
    }

    public WebUsers findByLogin(String login) {
        CriteriaQuery<WebUsers> criteriaQuery = criteriaBuilder.createQuery(WebUsers.class);
        Root<WebUsers> root = criteriaQuery.from(WebUsers.class);
        criteriaQuery.select(root);
        criteriaQuery.where(criteriaBuilder.equal(root.get(WebUsers_.login), login));
        TypedQuery<WebUsers> typedQuery = em.createQuery(criteriaQuery);
        List<WebUsers> resultList = typedQuery.getResultList();
        return resultList.get(0);
    }
}

