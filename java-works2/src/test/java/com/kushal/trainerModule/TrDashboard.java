package com.kushal.trainerModule;

import java.io.IOException;
import java.util.Scanner;

import com.kushal.beans.Trainer;

/**
 *
 * @author Kushal
 *
 */
public class TrDashboard {

	public void dashBoard(Trainer tr) {
		Scanner sc = new Scanner(System.in);
		TrProfile profile = new TrProfile();
		System.out.println("1. Profile..");
		System.out.println("2. Edit Profile..");
		System.out.println("3. Exit");


			int choose = sc.nextInt();

			switch (choose) {

			case 1:
				profile.viewProfile(tr);
				break;
			case 2:
				profile.editProfile(tr);
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