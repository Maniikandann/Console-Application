package com.manikandan.interviewpanel.hr;

import com.manikandan.interviewpanel.employee.DetailsModel;

import java.util.Scanner;

public class HrView {

	private HrModel hrModel;

	public HrView() {
		hrModel = new HrModel(this);
	}

	public void init() {
		DetailsModel d = new DetailsModel();
		Scanner s = new Scanner(System.in);
		boolean exit = false;

		while (!exit) {
			System.out.println("\nChoose an option:");
			System.out.println("1. Show candidate");
			System.out.println("2. Schedule interview");
			System.out.println("3. List scheduled interviews");
			System.out.println("4. Back");

			int choice = s.nextInt();
			s.nextLine();

			switch (choice) {
			case 1:
				if (!d.getAllCandidates().isEmpty()) {
					hrModel.showCandidate();
				} else {
					hrModel.noCandidate();
				}
				break;

			case 2:
				if (!d.getAllCandidates().isEmpty()) {

					System.out.print("\nEnter candidate ID to schedule interview: ");
					int candidateId = s.nextInt();
					s.nextLine();
					if (!hrModel.validId(candidateId)) {
						System.out.print("Enter interview date and time (yyyy-MM-dd HH:mm): ");
						String dateString = s.nextLine();

						hrModel.interview(candidateId, dateString);

					} else {
						System.out.println("You Enter the Worng Candidate id! ");
					}

				} else {
					hrModel.noCandidate();

				}
				break;
			case 3:
				if (!d.getAllCandidates().isEmpty()) {
					System.out.println("schedule list");
					hrModel.schedule();
				} else {
					hrModel.noCandidate();
				}
				break;

			case 4:
				exit = true;
				System.out.println("Exiting...");
				break;

			}
		}
	}
}
