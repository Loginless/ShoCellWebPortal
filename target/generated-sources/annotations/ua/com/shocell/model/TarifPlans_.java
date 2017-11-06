package ua.com.shocell.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(TarifPlans.class)
public abstract class TarifPlans_ {

	public static volatile SingularAttribute<TarifPlans, Integer> minutesToShoCell;
	public static volatile SingularAttribute<TarifPlans, Boolean> tarifPlanStatus;
	public static volatile SingularAttribute<TarifPlans, Integer> tarifPrice;
	public static volatile SingularAttribute<TarifPlans, String> tarifName;
	public static volatile SingularAttribute<TarifPlans, Integer> SMS;
	public static volatile SingularAttribute<TarifPlans, Integer> internetVolume;
	public static volatile SingularAttribute<TarifPlans, Integer> minutesToOtherOperators;
	public static volatile SingularAttribute<TarifPlans, Integer> tarifID;
	public static volatile SetAttribute<TarifPlans, ActivatedServices> actTarifPlansRecords;
	public static volatile SingularAttribute<TarifPlans, Integer> migrationPrice;

}

