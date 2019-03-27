package com.javabrains.dao;

import java.util.List;
import javax.persistence.FlushModeType;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.javabrains.model.Employee;
import com.javabrains.model.Vehicle;

public class EmployeeDao extends HibernateDaoSupport implements IEmployeeDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public void saveEmployee(Employee employee) {
		getHibernateTemplate().getSessionFactory().getCurrentSession().setFlushMode(FlushModeType.AUTO);
		getHibernateTemplate().save(employee);
	}

	@Transactional
	public List<Vehicle> fetchAllVehiclesOfAllEmployees() {
		Session session = sessionFactory.getCurrentSession();

		Query<Vehicle> query = session.createNativeQuery(
				"select * from vehicle where employee_id = (select employee_id from employee)", Vehicle.class);

		return query.getResultList();
	}
}
