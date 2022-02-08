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
public class EmpProfile {

	Scanner sc=new Scanner(System.in);
	public void viewProfile(Employee emp) {

		System.out.println("Trainer Profile------------");
		System.out.println("Name: " + emp.getEmpName());
		System.out.println("Email: " + emp.getEmpEmail());
		System.out.println("UserName: " + emp.getUsername());
		System.out.println("Stream: " + emp.getStream());
		System.out.println("YoJ: " + emp.getYoj());
		

		System.out.println("1.  GoBack. ");
		System.out.println("2.  Exit..");

			int choose = sc.nextInt();

			switch (choose) {

			case 1:
				EmpDashboard dashboard = new EmpDashboard();
				dashboard.dashBoard(emp);
				break;
			case 2:
				System.out.println("Exit");
				break;
			default:
				System.out.println("invalid choice");
				break;

			}


	}

	public void editProfile(Employee emp) {
		EmployeeDao dao = new EmployeeDao();
		Session session = getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();

		System.out.println("Edit Profile-----------");
			System.out.println("Name: " + emp.getEmpName());
			System.out.println("New Name: ");
			String name = sc.nextLine();
			emp.setEmpName(name);

			System.out.println("UserName: " + emp.getUsername());
			System.out.println("userName");
			String userName = sc.nextLine();
			emp.setUsername(userName);

			System.out.println("Password: " + emp.getPassword());
			System.out.println("Password");
			String password = sc.nextLine();
			emp.setPassword(password);

			System.out.println("Email: " + emp.getEmpEmail());
			System.out.println("Email");
			String email = sc.nextLine();
			emp.setEmpEmail(email);
			
			System.out.println("Stream: " + emp.getStream());
			System.out.println("Stream");
			String stream = sc.nextLine();
			emp.setStream(stream);

			dao.updateEmployee(emp, session);
			session.close();




	}

}
