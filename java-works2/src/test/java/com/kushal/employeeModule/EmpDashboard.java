package com.kushal.employeeModule;

import java.io.IOException;
import java.util.Scanner;

import com.kushal.beans.Employee;

/**
 *
 * @author Kushal
 *
 */
public class EmpDashboard {

	public void dashBoard(Employee emp) {
		Scanner sc = new Scanner(System.in);
		EmpProfile profile = new EmpProfile();
		System.out.println("1. Profile..");
		System.out.println("2. Edit Profile..");
		System.out.println("3. Exit");


			int choose = sc.nextInt();

			switch (choose) {

			case 1:
				profile.viewProfile(emp);
				break;
			case 2:
				profile.editProfile(emp);
				break;
			case 3:
				System.out.println("Exit");
				break;
			default:
				System.out.println("invalid choice");
				break;

			}

		
	}
}