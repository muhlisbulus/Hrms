package HRMS.Hrms.business.concretes.helpers;

import HRMS.Hrms.entities.concretes.Employer;

public class EmployerCheckHelper {
	
	public static boolean allFieldsAreRequried(Employer employer) {
		if(employer.getEmail().strip().isEmpty()
				|| employer.getPassword().strip().isEmpty()
				|| employer.getCompanyName().strip().isEmpty()
				|| employer.getWeb().strip().isEmpty()) {
			return false;
		}
		return true;
	}

}
