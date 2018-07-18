package com.projectratt.hibernate.util;

import java.util.HashMap;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.spi.PersistenceProviderResolverHolder;


//import org.eclipse.persistence.jpa.PersistenceProvider;

public class HibernateUtil {
    private static final String PERSISTENCE_UNIT_NAME = "Persistence";
    private static EntityManagerFactory factory;

    public static EntityManagerFactory getEntityManagerFactory() {
        if (factory == null) {
            factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
            //factory = PersistenceProvider().createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        }
        return factory;
    	//if (factory == null) {
            /*HashMap properties = new HashMap();
            properties.put(PersistenceUnitProperties.CLASSLOADER, this.getClass().getClassLoader());
            factory = new PersistenceProvider().createEntityManagerFactory(
            		PERSISTENCE_UNIT_NAME , 
                    properties);*/
    		
    }

    public static void shutdown() {
        if (factory != null) {
            factory.close();
        }
    }

}
