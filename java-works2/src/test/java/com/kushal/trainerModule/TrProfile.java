package com.kushal.trainerModule;

import static com.kushal.util.HibernateUtil.getSessionFactory;
import java.io.IOException;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.kushal.beans.Trainer;
import com.kushal.dao.TrainerDao;

/**
 *
 * @author Kushal
 *
 */
public class TrProfile {

	Scanner sc=new Scanner(System.in);
	public void viewProfile(Trainer tr) {

		System.out.println("Trainer Profile------------");
		System.out.println("Name: " + tr.getTrainerName());
		System.out.println("Email: " + tr.getTrainerEmail());
		System.out.println("UserName: " + tr.getUsername());
		System.out.println("Experience: " + tr.getYearOfExperience());
		

		System.out.println("1.  GoBack. ");
		System.out.println("2.  Exit..");

			int choose = sc.nextInt();

			switch (choose) {

			case 1:
				TrDashboard dashboard = new TrDashboard();
				dashboard.dashBoard(tr);
				break;
			case 2:
				System.out.println("Exit");
				break;
			default:
				System.out.println("invalid choice");
				break;

			}


	}

	public void editProfile(Trainer tr) {
		TrainerDao dao = new TrainerDao();
		Session session = getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();

		System.out.println("*--------Edit Profile-----------*");
			System.out.println("Name: " + tr.getTrainerName());
			System.out.println("New Name: ");
			String name = sc.nextLine();
			tr.setTrainerName(name);

			System.out.println("UserName: " + tr.getUsername());
			System.out.println("userName");
			String userName = sc.nextLine();
			tr.setUsername(userName);

			System.out.println("Password: " + tr.getPassword());
			System.out.println("Password");
			String password = sc.nextLine();
			tr.setPassword(password);

			System.out.println("Email: " + tr.getTrainerEmail());
			System.out.println("Email");
			String email = sc.nextLine();
			tr.setTrainerEmail(email);

			dao.updateTrainer(tr, session);
			session.close();




	}

}
