package HRMS.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import HRMS.Hrms.business.abtracts.WorkExperienceService;
import HRMS.Hrms.core.utilities.results.DataResult;
import HRMS.Hrms.core.utilities.results.Result;
import HRMS.Hrms.core.utilities.results.SuccessDataResult;
import HRMS.Hrms.core.utilities.results.SuccessResult;
import HRMS.Hrms.dataAccess.abstracts.WorkExperienceDao;
import HRMS.Hrms.entities.concretes.WorkExperience;

@Service
public class WorkExperienceManager implements WorkExperienceService{
	
	private WorkExperienceDao workExperienceDao;

	@Autowired
	public WorkExperienceManager(WorkExperienceDao workExperienceDao) {
		super();
		this.workExperienceDao = workExperienceDao;
	}

	@Override
	public Result add(WorkExperience workexperience) {
		if(workexperience.getEndYearOfWork()==null) {
			System.out.println("Devam Ediyor");
		}
		this.workExperienceDao.save(workexperience);
		return new SuccessResult("Başarıyla Eklendi");
	}

	@Override
	public DataResult<List<WorkExperience>> getAll() {
		
		return new SuccessDataResult<List<WorkExperience>>(this.workExperienceDao.findAll());
	}

	@Override
	public DataResult<List<WorkExperience>> sortByEndYearOfWork() {
		Sort sort=Sort.by(Sort.Direction.DESC,"Devam Ediyor");
		return new SuccessDataResult<List<WorkExperience>>(this.workExperienceDao.findAll(sort));
	}

}
