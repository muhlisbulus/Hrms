package HRMS.Hrms.business.concretes.helpers;

import HRMS.Hrms.entities.concretes.Candidate;

public class CandidateCheckHelper {
	public static boolean allFieldsAreRequried(Candidate candidate) {
		if(candidate.getEmail().strip().isEmpty()
				|| candidate.getPassword().strip().isEmpty()
				|| candidate.getFirstName().strip().isEmpty()
				|| candidate.getLastName().strip().isEmpty()
				|| candidate.getIdentityNumber().strip().isEmpty()
				|| candidate.getBirth_Date().toString().strip().isEmpty()) {
			return false;
			
		}
		return true;
	}

}
