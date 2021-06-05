package HRMS.Hrms.business.abtracts;

import java.util.List;

import HRMS.Hrms.core.utilities.results.DataResult;
import HRMS.Hrms.core.utilities.results.Result;
import HRMS.Hrms.entities.concretes.Education;

public interface EducationService {
	
	Result add(Education education);
	DataResult<List<Education>> getAll();
	
	DataResult<List<Education>> sortByEndYearOfSchool();
	

}
