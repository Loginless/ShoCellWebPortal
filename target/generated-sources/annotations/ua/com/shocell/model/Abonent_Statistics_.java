package ua.com.shocell.model;

import java.sql.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Abonent_Statistics.class)
public abstract class Abonent_Statistics_ {

	public static volatile SingularAttribute<Abonent_Statistics, Integer> usedVoiceServicesMin;
	public static volatile SingularAttribute<Abonent_Statistics, Integer> abonentStatistics;
	public static volatile SingularAttribute<Abonent_Statistics, Date> dateTo;
	public static volatile SingularAttribute<Abonent_Statistics, Abonents> abonentStatsRecord;
	public static volatile SingularAttribute<Abonent_Statistics, Integer> serviceID;
	public static volatile SingularAttribute<Abonent_Statistics, Date> dateFrom;
	public static volatile SingularAttribute<Abonent_Statistics, Integer> tarifID;
	public static volatile SingularAttribute<Abonent_Statistics, Integer> usedInternetTraffic;
	public static volatile SingularAttribute<Abonent_Statistics, Integer> usedMessagingServices;

}

