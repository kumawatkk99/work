package com.kushal.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.kushal.beans.Employee;
import com.kushal.beans.Trainer;

public class HibernateUtil {
	static SessionFactory sessionFactory = null; 
	private HibernateUtil() {}
	public static SessionFactory getSessionFactory() {
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		

		configuration.addAnnotatedClass(Employee.class); 
		
		configuration.addAnnotatedClass(Trainer.class);

		ServiceRegistry serviceRegistry = 
				new StandardServiceRegistryBuilder().
					applySettings(configuration.getProperties()).build();
		
		return configuration.buildSessionFactory(serviceRegistry);
	}
}