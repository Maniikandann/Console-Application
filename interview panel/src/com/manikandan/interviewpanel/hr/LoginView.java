package com.manikandan.interviewpanel.hr;

import java.util.Scanner;

public class LoginView {
	
	private LoginModel loginModel;

	public  LoginView() {
		loginModel = new LoginModel(this);
	}
	
	public void proceedLogin() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nEnter the user name:");
		String userName = scanner.next();
		System.out.println("Enter the password:");
		String password = scanner.next();
		loginModel.validateUser(userName, password);
	
	}

	public void onSuccess() {
		System.out.println("LOGIN SUCCESFUL");
		HrView hrView=new HrView();
		hrView.init();
		
	}

	public void onLoginFailed(String alertText) {
		System.out.println(alertText);
		checkForLogin();
	}

	private void checkForLogin() {
		System.out.println("Do you try again? \nType Yes/No");
		Scanner scanner = new Scanner(System.in);
		String choice = scanner.next();
		if (choice.equalsIgnoreCase("yes")) {
			proceedLogin();
		} else if (choice.equalsIgnoreCase("no")) {
			System.out.println("\n ---- Thanks You ----");
		} else {
			System.out.println("\nInvalid choice, Please enter valid choice.\n");
			checkForLogin();
		}
	}


}
