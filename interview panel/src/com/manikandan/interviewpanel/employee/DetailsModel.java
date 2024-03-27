package com.manikandan.interviewpanel.employee;


import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;



public class DetailsModel {
	 

	public class Candidate {

		private String name;
		private String email;
		private String date;

		public Candidate(String name, String email) {
			this.name = name;
			this.email = email;
		}

		public String getName() {
			return name;
		}

		public String getEmail() {
			return email;
		}

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

	}

	static public Map<Integer, Candidate> candidates = new LinkedHashMap<Integer, Candidate>();

	static int empID = 100;

	public Map<Integer, Candidate> getAllCandidates() {
		return candidates;
	}

	public void store(String name, String email) {

		Candidate candidate = new Candidate(name, email);
		candidates.put(empID, candidate);
		System.out.println("Your application for the job is successfull");
		System.out.println("Your Candidate ID Number is " + "\"" +empID++ +"\""
				+ "\nWait for the Interview to be scheduled \n");
		
	}

	public void schedule(int id, String name) {

		if (valid(id, name)) {
			if ((candidates.get(id).getDate()) == null) {
				System.out.println("Please Wait!...\nYour Interview Schedule is Not Prepared1 ");
			} else {
				System.out.println(candidates.get(id).getDate());
			}
		}

		else {
			System.out.println("You Details is Wrong");
		}

	}

	private boolean valid(int id, String name) {
		return (candidates.containsKey(id) && (candidates.get(id).getName()).equals(name));

	}

}
