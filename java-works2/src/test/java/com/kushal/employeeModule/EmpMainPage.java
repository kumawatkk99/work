package com.kushal.employeeModule;

import java.io.IOException;
import java.util.Scanner;

import com.kushal.app.App;


/**
 *
 * @author Kushal
 *
 */
public class EmpMainPage {

	EmpLogin login = new EmpLogin();
	EmpRegistration registration = new EmpRegistration();
	ChangePassword pass = new ChangePassword();

	public void employee() {
		Scanner sc=new Scanner(System.in);
		System.out.println("1. Employee Registration. ");
		System.out.println("2. Employee Login. ");
		System.out.println("3. Go Back");
		System.out.println("4. Exit");
		try {
			int choose = sc.nextInt();

			switch (choose) {
			case 1:
				registration.employeeRegistration();
				
				break;
			case 2:
				login.employeeLogin();
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