package HRMS.Hrms.business.abtracts;

import java.util.List;

import HRMS.Hrms.core.utilities.results.DataResult;
import HRMS.Hrms.entities.concretes.Employee;
import HRMS.Hrms.entities.concretes.Employer;

public interface EmployeeService {
	
	
	DataResult<List<Employee>> getAll();
	//DataResult<Boolean> confirmEmployer(Employer employer,Employee employee);

}
