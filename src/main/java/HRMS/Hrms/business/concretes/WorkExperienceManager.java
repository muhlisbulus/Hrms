package HRMS.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import HRMS.Hrms.business.abtracts.WorkExperienceService;
import HRMS.Hrms.core.utilities.dtoConverter.DtoConverterService;
import HRMS.Hrms.core.utilities.results.DataResult;
import HRMS.Hrms.core.utilities.results.Result;
import HRMS.Hrms.core.utilities.results.SuccessDataResult;
import HRMS.Hrms.core.utilities.results.SuccessResult;
import HRMS.Hrms.dataAccess.abstracts.WorkExperienceDao;
import HRMS.Hrms.entities.concretes.WorkExperience;
import HRMS.Hrms.entities.dtos.WorkExperienceDto;

@Service
public class WorkExperienceManager implements WorkExperienceService{
	
	private WorkExperienceDao workExperienceDao;
    private DtoConverterService dtoConverterService;
    
	@Autowired
	public WorkExperienceManager(WorkExperienceDao workExperienceDao, DtoConverterService dtoConverterService) {
		super();
		this.workExperienceDao = workExperienceDao;
		this.dtoConverterService = dtoConverterService;
	}

	@Override
	public DataResult<List<WorkExperienceDto>> getAll() {
		
		return new SuccessDataResult<List<WorkExperienceDto>>
		(this.dtoConverterService.dtoConverter(this.workExperienceDao.findAll(),WorkExperienceDto.class));
	}

	@Override
	public Result add(WorkExperienceDto workExperienceDto) {
		workExperienceDao.save((WorkExperience)dtoConverterService.dtoClassConverter(workExperienceDto, WorkExperience.class));
		return new SuccessResult("Başarıyla eklendi");
	}

	@Override
	public DataResult<List<WorkExperienceDto>> getAllByResume_ResumeIdOrderByendYearOfWorkDesc(int id) {
		
		return new SuccessDataResult<List<WorkExperienceDto>>
		(this.dtoConverterService.dtoConverter(this.workExperienceDao.findAllByResume_ResumeIdOrderByEndYearOfWorkDesc(id), WorkExperienceDto.class));
	}

	

}
