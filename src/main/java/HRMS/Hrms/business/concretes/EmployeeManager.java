package HRMS.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HRMS.Hrms.business.abtracts.EmployeeService;
import HRMS.Hrms.core.utilities.results.DataResult;
import HRMS.Hrms.core.utilities.results.SuccessDataResult;
import HRMS.Hrms.dataAccess.abstracts.EmployeeDao;
import HRMS.Hrms.entities.concretes.Employee;
import HRMS.Hrms.entities.concretes.Employer;

@Service
public class EmployeeManager implements EmployeeService {
	private EmployeeDao employeeDao;
	
   @Autowired
	public EmployeeManager(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}

	@Override
	public DataResult<List<Employee>> getAll() {
		
		return new SuccessDataResult<List<Employee>>(this.employeeDao.findAll());
	}

	//@Override
	//public DataResult<Boolean> confirmEmployer(Employer employer, Employee employee) {
		// TODO Auto-generated method stub
		//return null;
	//}

}
