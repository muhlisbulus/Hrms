package HRMS.Hrms.business.concretes;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HRMS.Hrms.business.abtracts.ResumeService;
import HRMS.Hrms.core.utilities.dtoConverter.DtoConverterService;
import HRMS.Hrms.core.utilities.results.DataResult;
import HRMS.Hrms.core.utilities.results.Result;
import HRMS.Hrms.core.utilities.results.SuccessDataResult;
import HRMS.Hrms.core.utilities.results.SuccessResult;
import HRMS.Hrms.dataAccess.abstracts.ResumeDao;
import HRMS.Hrms.entities.concretes.Resume;
import HRMS.Hrms.entities.dtos.ResumeAddDto;
import HRMS.Hrms.entities.dtos.ResumeGetDto;


@Service
public class ResumeManager implements ResumeService{

	private ResumeDao resumeDao;
	private DtoConverterService dtoConverterService;
	
	@Autowired
	public ResumeManager(ResumeDao resumeDao, DtoConverterService dtoConverterService) {
		super();
		this.resumeDao = resumeDao;
		this.dtoConverterService = dtoConverterService;
	}

	@Override
	public Result add(ResumeAddDto resumeAddDto) {
		this.resumeDao.save((Resume) dtoConverterService.dtoClassConverter(resumeAddDto, Resume.class));
		return new SuccessResult("Başarıyla Eklendi");
	}

	

	@Override
	public DataResult<List<ResumeGetDto>> getAll() {
		
		return new SuccessDataResult<List<ResumeGetDto>>
		(this.dtoConverterService.dtoConverter(this.resumeDao.findAll(), ResumeGetDto.class));
	}

	@Override
	public DataResult<List<ResumeGetDto>> findAllByCandidateUserId(int id) {
		
	   return new SuccessDataResult<List<ResumeGetDto>>(this.dtoConverterService.dtoConverter(this.resumeDao.findAll(),ResumeGetDto.class));

	
	}
	
	

}
