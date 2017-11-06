package ua.com.shocell.model;

import java.sql.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ActivatedServices.class)
public abstract class ActivatedServices_ {

	public static volatile SingularAttribute<ActivatedServices, Date> date;
	public static volatile SingularAttribute<ActivatedServices, Services> servicesRecord;
	public static volatile SingularAttribute<ActivatedServices, Integer> totalPrice;
	public static volatile SingularAttribute<ActivatedServices, Abonents> abonentActServ;
	public static volatile SingularAttribute<ActivatedServices, TarifPlans> tarifPlansRecord;
	public static volatile SingularAttribute<ActivatedServices, Integer> activatedServicesID;

}

