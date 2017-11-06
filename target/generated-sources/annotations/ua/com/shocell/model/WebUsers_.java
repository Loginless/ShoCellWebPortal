package ua.com.shocell.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(WebUsers.class)
public abstract class WebUsers_ {

	public static volatile SingularAttribute<WebUsers, String> password;
	public static volatile SingularAttribute<WebUsers, Boolean> adminType;
	public static volatile ListAttribute<WebUsers, Abonents> owners;
	public static volatile SingularAttribute<WebUsers, String> login;
	public static volatile SingularAttribute<WebUsers, Integer> userID;

}

