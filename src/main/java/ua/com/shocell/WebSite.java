package ua.com.shocell;

import ua.com.shocell.controller.DAOAbonImpl;
import ua.com.shocell.controller.DAOUserImpl;
import ua.com.shocell.controller.HibernateUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;


public class WebSite {
    public WebSite() {
    }

    public static void main(String[] args) throws ParseException {
        new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        EntityManagerFactory emf = HibernateUtil.getInstance().getEntityManagerFactory();
        EntityManager em = emf.createEntityManager();
        new DAOAbonImpl();
        DAOUserImpl daoUser = new DAOUserImpl();
        String login = "user134";
        if (daoUser.uniqLogin(login)) {
            System.out.println("Ok");
        } else {
            System.out.println("NOK");
        }

        em.close();
        emf.close();
    }
}

