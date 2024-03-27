package com.manikandan.interviewpanel.employee;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class DetailsView {
	Scanner s = new Scanner(System.in);

	public DetailsModel detailsModel = new DetailsModel();

	public DetailsView() {

	}

	public void detail() {
		System.out.print("\nEnter Your name: ");
		String name = s.nextLine();
		System.out.print("Enter Your email: ");
		String email = s.nextLine();
		if(email.contains("@gmail.com")) {
			detailsModel.store(name, email);	
		}else {
			System.out.println("please enter a valid email");
		}
	}

	public void showSchedule() {

		System.out.println("Enter your ID ");
		int id = s.nextInt();
		s.nextLine();
		System.out.println("Enter your name ");
		String name = s.nextLine();

		detailsModel.schedule(id, name);

	}

}