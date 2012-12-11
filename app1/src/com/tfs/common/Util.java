package com.tfs.common;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Util {
	
	private static BeanFactory factory;
	private static Session session;
	
	static {
		factory = new ClassPathXmlApplicationContext("beans.xml");
		Configuration config = new Configuration();
		SessionFactory sf = config.configure().buildSessionFactory();
		session = sf.openSession();
	}
	
	public static Object getObject(String name) {
		return factory.getBean(name);
	}

	public static Session getHibernateSession() {
		return session;
	}
}
