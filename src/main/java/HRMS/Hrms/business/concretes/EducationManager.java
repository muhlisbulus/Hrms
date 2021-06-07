package HRMS.Hrms.business.concretes;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import HRMS.Hrms.business.abtracts.EducationService;
import HRMS.Hrms.core.utilities.dtoConverter.DtoConverterService;
import HRMS.Hrms.core.utilities.results.DataResult;
import HRMS.Hrms.core.utilities.results.Result;
import HRMS.Hrms.core.utilities.results.SuccessDataResult;
import HRMS.Hrms.core.utilities.results.SuccessResult;
import HRMS.Hrms.dataAccess.abstracts.EducationDao;
import HRMS.Hrms.entities.concretes.Education;
import HRMS.Hrms.entities.dtos.EducationDto;

@Service
public class EducationManager implements EducationService {

	private EducationDao educaitonDao;
	private DtoConverterService dtoConverterService;

	@Autowired
	public EducationManager(EducationDao educaitonDao, DtoConverterService dtoConverterService) {
		super();
		this.educaitonDao = educaitonDao;
		this.dtoConverterService = dtoConverterService;
	}

	
	@Override
	public Result add(EducationDto educationDto) {
	 educaitonDao.save((Education)dtoConverterService.dtoClassConverter(educationDto, Education.class));
		return new SuccessResult("Okul Kayıdı Başarıyla Eklendi");
	}

	@Override
	public DataResult<List<EducationDto>> getAll() {
		
		return new SuccessDataResult<List<EducationDto>>(this.dtoConverterService.dtoConverter(this.educaitonDao.findAll(),EducationDto.class));
	}





	@Override
	public DataResult<List<EducationDto>> findAllByResume_ResumeIdOrderByEndYearOfSchoolDesc(int id) {
	
		return new SuccessDataResult<List<EducationDto>>(this.dtoConverterService.dtoConverter(this.educaitonDao.findAllByResume_ResumeIdOrderByEndYearOfSchoolDesc(id), EducationDto.class));
	}
}


