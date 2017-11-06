package ua.com.shocell.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Services.class)
public abstract class Services_ {

	public static volatile SetAttribute<Services, ActivatedServices> activateServRecords;
	public static volatile SingularAttribute<Services, String> Description;
	public static volatile SingularAttribute<Services, Integer> activationPrice;
	public static volatile SingularAttribute<Services, Integer> addMinutesToOtherOperators;
	public static volatile SingularAttribute<Services, Integer> addMinutesToShoCell;
	public static volatile SingularAttribute<Services, Integer> addInternetVolume;
	public static volatile SingularAttribute<Services, Integer> serviceID;
	public static volatile SingularAttribute<Services, String> serviceName;
	public static volatile SingularAttribute<Services, String> category;
	public static volatile SingularAttribute<Services, Integer> addSMS;

}

