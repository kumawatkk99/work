package com.kushal.trainerModule;

import static com.kushal.util.HibernateUtil.getSessionFactory;
import java.io.IOException;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.kushal.dao.TrainerDao;

/**
 *
 * @author Kushal
 *
 */
public class ChangePassword {

	public void forgotPass() throws IOException {
		Scanner sc=new Scanner(System.in);
		TrainerDao dao = new TrainerDao();
		Session session = getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();

		System.out.println("Forgot Password---------");
		System.err.println("Enter UserName..");
		String username = sc.nextLine();
		System.out.println("new Password");
		String password = sc.nextLine();

		dao.changePassword(session, username, password);

	}

}