package com.duan;

import com.duan.inter.IChangeLetter;
import com.duan.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * com.duan
 * Created by duanda on 11/20/15.
 */
public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		IChangeLetter upperCase = (IChangeLetter) context.getBean("upperCase");
		System.out.println("---> result: " + upperCase.changeLetter());

		Employee employee = new Employee();
		employee.setId(1);
		employee.setAge(20);
		employee.setName("Tim");
		SessionFactory sessionFactory = (SessionFactory) context.getBean("sessionFactory");
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(employee);
		transaction.commit();
	}
}
