package com.javabrains.dao;

import java.util.List;

import javax.persistence.FlushModeType;

import org.hibernate.Session;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.javabrains.model.Employee;

@Transactional
public class EmployeeDao extends HibernateDaoSupport implements IEmployeeDAO {
	
	public void saveEmployee(Employee employee) {
		getHibernateTemplate().getSessionFactory().getCurrentSession().setFlushMode(FlushModeType.AUTO);
		getHibernateTemplate().save(employee);
	}

	public List<Employee> fetchAllEmployees() {
		Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
		return getHibernateTemplate().loadAll(Employee.class);
	}
}
