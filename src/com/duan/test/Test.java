package com.duan.test;

import com.duan.model.Employee;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * com.duan.test
 * Created by Da DUAN on 2015/11/27.
 */
public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

		Employee employee = new Employee();
		employee.setName("Marcus");
		employee.setPassword("123");
		queryEmployee(context, employee);
	}

	private static void saveEmployee(ApplicationContext context) {
		Employee employee = new Employee();
		employee.setGrade(2);
		employee.setName("Marcus");
		employee.setPassword("123");
		SessionFactory sessionFactory = (SessionFactory) context.getBean("sessionFactory");
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(employee);
		transaction.commit();
	}

	private static void queryEmployee(ApplicationContext context, Employee employee) {
		String hql = "FROM Employee WHERE name=? AND password=?";
		SessionFactory sessionFactory = (SessionFactory) context.getBean("sessionFactory");
		Query query = sessionFactory.openSession().createQuery(hql);
		List list = query.setString(0, employee.getName()).setString(1, employee.getPassword()).list();
		System.out.println("---> query result size: " + list.size());
	}
}
