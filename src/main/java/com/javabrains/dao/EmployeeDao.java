package com.javabrains.dao;

import java.util.List;

import javax.persistence.FlushModeType;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.orm.hibernate5.support.OpenSessionInViewInterceptor;
import org.springframework.transaction.annotation.Transactional;

import com.javabrains.model.Employee;


public class EmployeeDao extends HibernateDaoSupport implements IEmployeeDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public void saveEmployee(Employee employee) {
		getHibernateTemplate().getSessionFactory().getCurrentSession().setFlushMode(FlushModeType.AUTO);
		getHibernateTemplate().save(employee);
	}

	@Transactional
	public List<Employee> fetchAllEmployees() {
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("from Employee").getResultList();
	}
}
