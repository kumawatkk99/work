package com.kushal.dao;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import com.kushal.beans.Employee;
import com.kushal.employeeModule.EmpDashboard;
import com.kushal.employeeModule.EmpMainPage;

import org.hibernate.query.Query;

/**
 *
 * @author Kushal
 *
 */
public class EmployeeDao implements IEmployeeDao {

	@Override
	public void saveEmployee(Session session, Employee trainer) {
		session.save(trainer);
		session.getTransaction().commit();
		System.out.println("registration Done");

	}

	@Override
	public void getEmployee(Session session, String username, String password) {
		EmpDashboard dash = new EmpDashboard();
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<Employee> query = criteriaBuilder.createQuery(Employee.class);
		Root<Employee> root = query.from(Employee.class);
		query.select(root).where(criteriaBuilder.equal(root.get("username"), username),
				criteriaBuilder.equal(root.get("password"), password));

		Query<Employee> employeeQuery = session.createQuery(query);
		Employee emp = employeeQuery.getSingleResult();
		dash.dashBoard(emp);

	}

	@Override
	public void updateEmployee(Employee emp, Session session) {
		session.merge(emp);
		session.getTransaction().commit();
		System.out.println("Updation successfull..");
		EmpMainPage tmp=new EmpMainPage();
		tmp.employee();

	}

	public void changePassword(Session session, String username, String password) {
		String query = "UPDATE Employee1 SET password = '" + password + "' WHERE username = '" + username + "'";
		try {
			session.createSQLQuery(query).executeUpdate();
			session.getTransaction().commit();
			System.out.println("password Changed....");
		} catch (HibernateException e) {
			session.getTransaction().rollback();
		}

	}

}
