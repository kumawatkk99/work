package com.kushal.employeeModule;

import java.io.IOException;
import java.util.Scanner;

import static com.kushal.util.HibernateUtil.getSessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.kushal.dao.EmployeeDao;


/**
 *
 * @author Kushal
 *
 */
public class EmpLogin {
	Scanner sc=new Scanner(System.in);
	EmployeeDao dao = new EmployeeDao();
	Session session = getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();

	public void employeeLogin() throws IOException {

		System.out.println("Enter UserName: ");
		String userName = sc.nextLine();

		System.out.println("Enter Password: ");
		String password = sc.nextLine();

		dao.getEmployee(session, userName, password);
		session.close();

	}

}