package com.manikandan.interviewpanel.menu;

import java.util.Scanner;

import com.manikandan.interviewpanel.employee.Canditate;
import com.manikandan.interviewpanel.hr.LoginView;

public class OfficeView {

	public void office() {
		Scanner s = new Scanner(System.in);
		boolean exit = false;
		while (!exit) {
			
			System.out.println("1.Employee");
			System.out.println("2.Employer"); 
			System.out.println("3.Exit");
			System.out.print("Please enter your option: ");
			int choose = s.nextInt();
			s.nextLine();
			switch (choose) {
			case 1:
				Canditate canditate = new Canditate();
				canditate.canditate();
				break;
			case 2:
				LoginView login = new LoginView();
				login.proceedLogin();
				break;
			case 3:
				exit = true;
				System.out.println("Thank for Your Visit");
				break;
			default:
				System.out.println("Invalid choice!. Please choose a valid option.\n");
			}
		}
		s.close();
	}
}
