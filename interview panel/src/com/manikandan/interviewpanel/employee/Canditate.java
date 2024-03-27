package com.manikandan.interviewpanel.employee;

import java.util.Scanner;

public class Canditate {

	DetailsModel d = new DetailsModel();

	public void canditate() {
		DetailsView detail = new DetailsView();
		Scanner s = new Scanner(System.in);
		boolean exit = false;
		while (!exit) {
			System.out.println("\n1.Apply for the job");
			System.out.println("2.View Your Schedule");
			System.out.println("3.Back");
			System.out.print("Please select an option:");
			int choose = s.nextInt();
			s.nextLine();
			switch (choose) {
			case 1:
				detail.detail();
				break;
			case 2:
				detail.showSchedule();
				break;
			case 3:
				exit = true;
				System.out.println("\n");
				break;
			default:
				System.out.println("Invalid choice. Please choose a valid option.");
			}
		}
	}
}
