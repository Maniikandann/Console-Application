package com.manikandan.interviewpanel.hr;


public class LoginModel {
	private LoginView loginView;

	LoginModel(LoginView loginView) {
		this.loginView = loginView;
	}

	public void validateUser(String userName, String password) {
		if (isValidUserName(userName)) {
			if (isValidPassword(userName,password)) {
				loginView.onSuccess();
			} else {
				loginView.onLoginFailed("Invalid password");
			}
		} else {
			loginView.onLoginFailed("Invalid User Name");
		}
	}
	private boolean isValidUserName(String userName) {
		return userName.equals("manicon");
	}

	private boolean isValidPassword(String userName, String password) {
		return (userName.equals("manicon")&&password.equals("admin"));
	}
}
