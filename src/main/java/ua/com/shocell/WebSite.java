//package ua.com.shocell;
//
//import ua.com.shocell.controller.DAOAbonImpl;
//import ua.com.shocell.controller.DAOUserImpl;
//import ua.com.shocell.controller.GeneralDAO;
////import ua.com.shocell.controller.HibernateUtil;
//import ua.com.shocell.model.WebUsers;
//
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Locale;
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//
//
//public class WebSite {
//    public WebSite() {
//    }
//
//
//    public static void main(String[] args) throws ParseException {
//
//
//        //Date formate
//        SimpleDateFormat inputDate = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
//
//        //Create link for EntityManagerFactory and EntityManager objects from Hibernate Util
//        EntityManagerFactory emf = HibernateUtil.getInstance().getEntityManagerFactory();
//        EntityManager em = emf.createEntityManager();
//
//        //Create General DAO object
//        GeneralDAO dao = new GeneralDAO() {};
//        DAOAbonImpl DAOAbon = new DAOAbonImpl();
//
////        //Create WebUser and TestAbonent objects
//        WebUsers user1 = new WebUsers("User1", "123", true);
//        WebUsers user2 = new WebUsers("User2", "123", false);
//        WebUsers user3 = new WebUsers("User3", "123", false);
//        WebUsers user4 = new WebUsers("User4", "123", false);
////
////        //Create Abonents
////        PrePaid prePaid1 = new PrePaid("name1", "surname1", +380935672020L,true, user1);
////        PrePaid prePaid2 = new PrePaid("name2", "surname2", +380935672021L,true, user1);
////        PrePaid prePaid3 = new PrePaid("name3", "surname3", +380935672022L,true, user2);
////        PrePaid prePaid4 = new PrePaid("name4", "surname4", +380935672023L,true, user3);
////        Contract contract1 = new Contract(123, 232, 5, +380935672024L,false, user4);
////        Contract contract2 = new Contract(323, 43, 5, +380935672025L,true, user2);
////        Contract contract3 = new Contract(32, 34, 5, +380935672026L,false, user1);
////        Contract contract4 = new Contract(33, 12, 5, +380935672027L,true, user3);
////        Contract contract5 = new Contract(354, 132, 5, +380935672028L,true, user3);
////
////        //Create Services
////        Services service1 = new Services("Digital communication","Communication","Unlimited traffic for all messangers",0,0,0,10,30);
////        Services service2 = new Services("ShoCell video","3G+Internet","Free online video traffic",0,0,0,10,40);
////        Services service3 = new Services("ShoCell video","Entertainment","Unlimited traffic for music aplications",0,0,0,10,45);
////
////        //Create Tarif Plans
////        TarifPlans tarifPlan1 = new TarifPlans("Absolute Freedom",120,500,500,1,true,135,50);
////        TarifPlans tarifPlan2 = new TarifPlans("3G Freedom",50,120,500,2,true,100,30);
////        TarifPlans tarifPlan3 = new TarifPlans("Smartphone 3G",0,0,0,5,false,75,20);
////        TarifPlans tarifPlan4 = new TarifPlans("Summer",140,250,800,3,true,200,0);
////        TarifPlans tarifPlan5 = new TarifPlans("Smart Family",600,0,1000,2,true,150,0);
//
//        //Create Payments
////        Date myDate1 = inputDate.parse("2012-06-12");
////        Date myDate2 = inputDate.parse("2012-06-12");
////        Date myDate3 = inputDate.parse("2015-08-12");
////        Date myDate4 = inputDate.parse("2017-09-17");
////        Date myDate5 = inputDate.parse("2017-09-17");
////        Date myDate6 = inputDate.parse("2017-09-07");
////
////        Payments payment1 = new Payments(myDate1,325, prePaid4);
////        Payments payment3 = new Payments(myDate2,215, prePaid2);
////        Payments payment4 = new Payments(myDate3,23, prePaid4);
////        Payments payment5 = new Payments(myDate4,543, contract3);
////        Payments payment6 = new Payments(myDate5,123, contract3);
//
//        //Persist users into the database
////        dao.createMultipleObjects(user1,user2,user3,user4);
//
//        //Persist abonents into the database
////        dao.createMultipleObjects(prePaid1,prePaid2,prePaid3,prePaid4,contract1,contract2,contract3,contract4,contract5);
//
//        //Persist Services into the database
////        dao.createMultipleObjects(service1,service2,service3);
//
//        //Persist Services into the database
////        dao.createMultipleObjects(tarifPlan1,tarifPlan2,tarifPlan3, tarifPlan4, tarifPlan5);
//
//        //Persist Services into the database
////        dao.createMultipleObjects(payment1,payment3, payment4, payment5, payment6);
//
//
//
//
////
////        dao.findAll(WebUsers.class);
////        List<Abonents> testabone = dao.findAll(Abonents.class);
////        for (Abonents temp : testabone) {
////            System.out.println(temp);
////        }
////        System.out.println();
//
////        List<Abonents> test1 = DAOAbon.getByMobileNumber(380935672020L);
////        List<Abonents> test2 = DAOAbon.getByMobileNumber(380935672020L);
////        List<Abonents> test3 = DAOAbon.getByMobileNumber(380935672020L);
////
////        List<Payments> paym1 = dao.findAll(Payments.class);
////        List<Payments> paym2 = dao.findAll(Payments.class);
////        List<Payments> paym3 = dao.findAll(Payments.class);
//
////        List<Payments> paym2 = DAOAbon.getByMobileNumber(380935672020L);
////        List<Payments> paym3 = DAOAbon.getByMobileNumber(380935672020L);
//
////        for (Abonents temp : testList) {
////            System.out.println(temp);
////        }
//
////        Object[] result = (Object[]) AuditReaderFactory
////                .get(em)
////                .createQuery()
////                .forRevisionsOfEntity(WebUsers.class, false, true)
////                .setMaxResults(1)
////                .getSingleResult();
////        System.out.println(result[0]);
////        System.out.println(result[1]);
////        System.out.println(result[2]);
//        DAOUserImpl daoUser = new DAOUserImpl();
//
////        String login = "user134";
////        if(daoUser.uniqLogin(login) == true) {
////            System.out.println("Ok");
////        } else {
////            System.out.println("NOK");
////        }
//
//
//        em.close();
//        emf.close();
//    }
//}
//
