package HRMS.Hrms.business.abtracts;

import java.util.List;

import HRMS.Hrms.core.utilities.results.DataResult;
import HRMS.Hrms.core.utilities.results.Result;
import HRMS.Hrms.entities.concretes.WorkExperience;

public interface WorkExperienceService {
	Result add(WorkExperience workexperience);
	
	DataResult<List<WorkExperience>> getAll();
	
	DataResult<List<WorkExperience>> sortByEndYearOfWork();

}
