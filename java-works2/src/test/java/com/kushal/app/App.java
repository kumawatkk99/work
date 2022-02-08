package com.kushal.app;

import java.io.IOException;
import java.util.Scanner;

import com.kushal.employeeModule.EmpMainPage;
import com.kushal.trainerModule.TrMainPage;

/**
 *
 * @author kushal
 *
 */
public class App {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TrMainPage tr = new TrMainPage();
		// Employee emp = new Employee();
		EmpMainPage emp=new EmpMainPage();

		System.out.println("Welcome-------------");
		System.out.println("Select one Option.");
		System.out.println("1.  Trainer");
		System.out.println("2.  Employee");
		System.out.println("3.  Exit");

		
			int choose = sc.nextInt();

			switch (choose) {

			case 1:
				tr.trainer();
				break;
			case 2:
				 emp.employee();
				break;
			default:
				System.out.println("Try Again");
				App.main(null);
				break;

			}

		

	}

}
