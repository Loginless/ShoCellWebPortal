package ua.com.shocell.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Payments.class)
public abstract class Payments_ {

	public static volatile SingularAttribute<Payments, Date> date;
	public static volatile SingularAttribute<Payments, Integer> paymentID;
	public static volatile SingularAttribute<Payments, Integer> paymentSum;
	public static volatile SingularAttribute<Payments, Abonents> abonentID;

}

