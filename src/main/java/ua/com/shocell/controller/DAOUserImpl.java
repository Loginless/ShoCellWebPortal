package ua.com.shocell.controller;

import java.util.List;
import javax.persistence.TypedQuery;
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
        CriteriaQuery<WebUsers> criteriaQuery = this.criteriaBuilder.createQuery(WebUsers.class);
        Root<WebUsers> root = criteriaQuery.from(WebUsers.class);
        criteriaQuery.select(root);
        criteriaQuery.where(this.criteriaBuilder.equal(root.get(WebUsers_.login), login));
        TypedQuery<WebUsers> typedQuery = this.em.createQuery(criteriaQuery);
        List<WebUsers> resultList = typedQuery.getResultList();
        return resultList.isEmpty();
    }

    public boolean LoginPasswordMatch(String login, String password) {
        CriteriaQuery<WebUsers> criteriaQuery = this.criteriaBuilder.createQuery(WebUsers.class);
        Root<WebUsers> root = criteriaQuery.from(WebUsers.class);
        criteriaQuery.select(root);
        criteriaQuery.where(this.criteriaBuilder.equal(root.get(WebUsers_.login), login));
        TypedQuery<WebUsers> typedQueryLogin = this.em.createQuery(criteriaQuery);
        List<WebUsers> resultListLogin = typedQueryLogin.getResultList();
        criteriaQuery.where(this.criteriaBuilder.equal(root.get(WebUsers_.password), password));
        TypedQuery<WebUsers> typedQueryPassword = this.em.createQuery(criteriaQuery);
        List<WebUsers> resultListPassword = typedQueryPassword.getResultList();
        return resultListLogin.equals(login) && resultListPassword.equals(password);
    }
}

