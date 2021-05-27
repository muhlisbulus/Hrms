package HRMS.Hrms.business.abtracts;

import java.util.List;

import HRMS.Hrms.core.utilities.results.DataResult;
import HRMS.Hrms.core.utilities.results.Result;
import HRMS.Hrms.entities.concretes.Employer;

public interface EmployerService {
	 DataResult<List<Employer>> getAll();
	    Result add(Employer employer);
	    DataResult<List<Employer>> findByEmail(String Email);

}
