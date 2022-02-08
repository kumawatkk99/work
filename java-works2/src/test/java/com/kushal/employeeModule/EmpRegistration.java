package com.kushal.employeeModule;

import static com.kushal.util.HibernateUtil.getSessionFactory;

import java.io.IOException;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.kushal.beans.Employee;
import com.kushal.dao.EmployeeDao;

/**
 *
 * @author Kushal
 *
 */
public class EmpRegistration {
	Scanner sc=new Scanner(System.in);
	public void employeeRegistration() {

		Session session = getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();

		EmployeeDao dao = new EmployeeDao();
		Employee emp = new Employee();
		
			System.out.println("Employee Name: ");
			String name = sc.nextLine();
			emp.setEmpName(name);
			System.out.println("Email: ");
			String email = sc.nextLine();
			emp.setEmpEmail(email);
			System.out.println("UserName: ");
			String userName = sc.nextLine();
			emp.setUsername(userName);
			System.out.println("Password: ");
			String password = sc.nextLine();
			emp.setPassword(password);
			System.out.println("Stream: ");
			String stream = sc.nextLine();
			emp.setStream(stream);
			System.out.println("Yoj: ");
			int yoj = sc.nextInt();
			emp.setYoj(yoj);
			

			dao.saveEmployee(session, emp);
			session.close();
			
			EmpMainPage tmp=new EmpMainPage();
			tmp.employee();

		
	}
		
	}

