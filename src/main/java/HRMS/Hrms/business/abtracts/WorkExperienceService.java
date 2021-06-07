package HRMS.Hrms.business.abtracts;

import java.util.List;

import HRMS.Hrms.core.utilities.results.DataResult;
import HRMS.Hrms.core.utilities.results.Result;
import HRMS.Hrms.entities.concretes.WorkExperience;
import HRMS.Hrms.entities.dtos.WorkExperienceDto;

public interface WorkExperienceService {
	Result add(WorkExperienceDto workexperienceDto);
	
	DataResult<List<WorkExperienceDto>> getAll();
	
	DataResult<List<WorkExperienceDto>> getAllByResume_ResumeIdOrderByendYearOfWorkDesc(int id);
	
	

}
