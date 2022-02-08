package com.kushal.trainerModule;

import java.io.IOException;
import java.util.Scanner;

import com.kushal.app.App;


/**
 *
 * @author Kushal
 *
 */
public class TrMainPage {

	TrLogin login = new TrLogin();
	TrRegistration registration = new TrRegistration();
	ChangePassword pass = new ChangePassword();

	public void trainer() {
		Scanner sc=new Scanner(System.in);
		System.out.println("1. Trainer Registration. ");
		System.out.println("2. Trainer Login. ");
		System.out.println("3. Go Back");
		System.out.println("4. Exit");
		try {
			int choose = sc.nextInt();

			switch (choose) {
			case 1:
				registration.trainerRegistration();
				break;
			case 2:
				login.trainerLogin();
				break;
			case 3:
				App.main(null);
				break;
			//case 4:
				//pass.forgotPass();
			//	break;
			case 4:
				System.out.println("Exit..");
				break;
			default:
				System.out.println("Check Again");
				break;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}