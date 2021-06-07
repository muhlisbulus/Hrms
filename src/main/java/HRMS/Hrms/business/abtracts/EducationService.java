package HRMS.Hrms.business.abtracts;

import java.util.List;

import HRMS.Hrms.core.utilities.results.DataResult;
import HRMS.Hrms.core.utilities.results.Result;

import HRMS.Hrms.entities.dtos.EducationDto;

public interface EducationService {
	
	Result add(EducationDto educationDto);
	DataResult<List<EducationDto>> getAll();
   DataResult<List<EducationDto>> findAllByResume_ResumeIdOrderByEndYearOfSchoolDesc(int resumeId);

	
	

}
