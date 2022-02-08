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
public class TrRegistration {
	Scanner sc=new Scanner(System.in);
	public void trainerRegistration() {

		Session session = getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();

		TrainerDao dao = new TrainerDao();
		Trainer trainer = new Trainer();
		
			System.out.println("Trainer Name: ");
			String name = sc.nextLine();
			trainer.setTrainerName(name);
			System.out.println("Email: ");
			String email = sc.nextLine();
			trainer.setTrainerEmail(email);
			System.out.println("UserName: ");
			String userName = sc.nextLine();
			trainer.setUsername(userName);
			System.out.println("Password: ");
			String password = sc.nextLine();
			trainer.setPassword(password);
			System.out.println("Year of Experience: ");
			int yearOfExperience = sc.nextInt();
			trainer.setYearOfExperience(yearOfExperience);
			

			dao.saveTrainer(session, trainer);
			session.close();
			
			TrMainPage tmp=new TrMainPage();
			tmp.trainer();

		

		
	}

}