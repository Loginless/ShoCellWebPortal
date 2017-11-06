package ua.com.shocell.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Abonents.class)
public abstract class Abonents_ {

	public static volatile ListAttribute<Abonents, Payments> paymentRecords;
	public static volatile SingularAttribute<Abonents, WebUsers> webUserID;
	public static volatile SingularAttribute<Abonents, Long> mobileNumber;
	public static volatile SingularAttribute<Abonents, Boolean> abonentStatus;
	public static volatile SingularAttribute<Abonents, Integer> abonentID;
	public static volatile ListAttribute<Abonents, ActivatedServices> actServicesRecords;
	public static volatile ListAttribute<Abonents, Abonent_Statistics> abonStatRecords;

}

