package HRMS.Hrms.business.concretes;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import HRMS.Hrms.business.abtracts.EducationService;
import HRMS.Hrms.core.utilities.results.DataResult;
import HRMS.Hrms.core.utilities.results.Result;
import HRMS.Hrms.core.utilities.results.SuccessDataResult;
import HRMS.Hrms.core.utilities.results.SuccessResult;
import HRMS.Hrms.dataAccess.abstracts.EducationDao;
import HRMS.Hrms.entities.concretes.Education;

@Service
public class EducationManager implements EducationService {

	private EducationDao educaitonDao;
	
	@Autowired
	public EducationManager(EducationDao educaitonDao) {
		super();
		this.educaitonDao = educaitonDao;
	}

	@Override
	public Result add(Education education) {
		if(education.getEndYearOfSchool()==null) {
		System.out.println("Devam Ediyor");
			
		}
		this.educaitonDao.save(education);
		return new SuccessResult("Okul Kayıdı Başarıyla Eklendi");
	}

	@Override
	public DataResult<List<Education>> getAll() {
		
		return new SuccessDataResult<List<Education>>(this.educaitonDao.findAll());
	}

	@Override
	public DataResult<List<Education>> sortByEndYearOfSchool() {
		Sort sort=Sort.by(Sort.Direction.DESC,"Devam Ediyor");
		return new SuccessDataResult<List<Education>>(this.educaitonDao.findAll(sort));
	}
	
	

}
