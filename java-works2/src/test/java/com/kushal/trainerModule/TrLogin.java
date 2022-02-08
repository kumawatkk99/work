package com.kushal.trainerModule;

import java.io.IOException;
import java.util.Scanner;

import static com.kushal.util.HibernateUtil.getSessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.kushal.dao.TrainerDao;


/**
 *
 * @author Kushal
 *
 */
public class TrLogin {
	Scanner sc=new Scanner(System.in);
	TrainerDao dao = new TrainerDao();
	Session session = getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();

	public void trainerLogin() throws IOException {

		System.out.println("Enter UserName: ");
		String userName = sc.nextLine();

		System.out.println("Enter Password: ");
		String password = sc.nextLine();

		dao.getTrainer(session, userName, password);
		session.close();

	}

}