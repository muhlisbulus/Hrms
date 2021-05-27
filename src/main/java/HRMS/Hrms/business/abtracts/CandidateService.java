package HRMS.Hrms.business.abtracts;

import java.util.List;

import HRMS.Hrms.core.utilities.results.DataResult;
import HRMS.Hrms.core.utilities.results.Result;
import HRMS.Hrms.entities.concretes.Candidate;


public interface CandidateService {
	 DataResult<List<Candidate>> getAll();
	    Result add(Candidate candidate);
	   
		DataResult<List<Candidate>> findByIdentityNumber(String identityNumber);
		DataResult<List<Candidate>> findByEmail(String email);
		
		DataResult<Boolean> checkValidateByPersonalInfo(String identityNumber,String firstName,String lastName,String birth_date);
		
		
		

}
