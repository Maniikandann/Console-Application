package com.manikandan.interviewpanel.hr;

import com.manikandan.interviewpanel.employee.DetailsModel;

public class HrModel {
	DetailsModel d = new DetailsModel();
	private HrView hrView;

	public HrModel(HrView hrView) {
		this.hrView = hrView;

	}

	public void showCandidate() {

		System.out.println("Available Candidates ");
		for (Integer candidateID : d.getAllCandidates().keySet()) {
			System.out.println("Candidate id :" + candidateID);
			System.out.println(d.candidates.get(candidateID).getName());
		}
	}

	public void interview(int candidateId, String dataString) {
		d.getAllCandidates().get(candidateId).setDate(dataString);}

	

	public void schedule() {
		for (Integer candidateID : d.getAllCandidates().keySet()) {
			System.out.println("Candidate id :" + candidateID);
			System.out.println(d.candidates.get(candidateID).getDate());
		}

	}
	public boolean validId(int candidateId) {
		if(!d.getAllCandidates().keySet().contains(candidateId)) {
			return true;
		}
		return false;
		
		
	}

	public void noCandidate() {
		System.out.println("No candidates to interviews.");
	}
}
