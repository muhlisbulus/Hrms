package HRMS.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HRMS.Hrms.business.abtracts.EmployerService;
import HRMS.Hrms.business.concretes.helpers.EmployeeCheckHelper;
import HRMS.Hrms.business.concretes.helpers.EmployerCheckHelper;
import HRMS.Hrms.core.utilities.results.DataResult;
import HRMS.Hrms.core.utilities.results.ErrorResult;
import HRMS.Hrms.core.utilities.results.Result;
import HRMS.Hrms.core.utilities.results.SuccessDataResult;
import HRMS.Hrms.core.utilities.results.SuccessResult;
import HRMS.Hrms.dataAccess.abstracts.EmployerDao;
import HRMS.Hrms.entities.concretes.Employer;
@Service
public class EmployerManager implements EmployerService{
	private EmployerDao employerdao;


	@Autowired
	public EmployerManager(EmployerDao employerdao) {
		super();
		this.employerdao = employerdao;
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		
		return new SuccessDataResult<List<Employer>>(this.employerdao.findAll());
	}

	@Override
	public Result add(Employer employer) {
		var checkEmail=this.findByEmail(employer.getEmail()).getData().size()!=0;	
		var checkFields=!EmployerCheckHelper.allFieldsAreRequried(employer);
		var checkConfirm=!EmployeeCheckHelper.confirmEmployer(employer);
		
		if(checkEmail|| checkFields|| checkConfirm) {
			String errorMessage="";
			if(checkEmail) {
				errorMessage+="Email Zaten Mevcut.";
			}
			if(checkFields) {
				errorMessage+="Bütün Alanlar Zorunludur.";
				
			}
			if(checkConfirm) {
				errorMessage+="Kayıt onay işleminiz Çalışanımız tarafından reddedildi.";
			}
			return new ErrorResult(errorMessage);
		}
		
		this.employerdao.save(employer);
		return new SuccessResult(true,"Kayıdınız Başarıyla gerçekleşti.");
	}

	@Override
	public DataResult<List<Employer>> findByEmail(String email) {
		
	   return new SuccessDataResult<List<Employer>>(this.employerdao.findByEmail(email));
	}
}
