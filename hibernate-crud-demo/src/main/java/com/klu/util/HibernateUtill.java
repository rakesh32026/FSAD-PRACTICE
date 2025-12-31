package com.klu.util;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtill {
	private static SessionFactory factory;
	static {
		factory = new Configuration().buildSessionFactory()configure("hibernate.cfg.xml").buildSessionFactory();
	

}
	private static Configuration configure(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
