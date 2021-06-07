package HRMS.Hrms.business.abtracts;

import java.util.List;

import HRMS.Hrms.core.utilities.results.DataResult;
import HRMS.Hrms.core.utilities.results.Result;

import HRMS.Hrms.entities.dtos.ResumeAddDto;
import HRMS.Hrms.entities.dtos.ResumeGetDto;


public interface ResumeService {
	Result add(ResumeAddDto resumeAddDto);
	
	DataResult<List<ResumeGetDto>> getAll();
	
	
	DataResult<List<ResumeGetDto>> findAllByCandidateUserId(int id);

}
