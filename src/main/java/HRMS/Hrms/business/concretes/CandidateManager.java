package HRMS.Hrms.business.concretes;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import HRMS.Hrms.business.abtracts.CandidateService;
import HRMS.Hrms.business.concretes.helpers.CandidateCheckHelper;
import HRMS.Hrms.core.utilities.adapters.ValidationService;
import HRMS.Hrms.core.utilities.results.DataResult;
import HRMS.Hrms.core.utilities.results.ErrorResult;
import HRMS.Hrms.core.utilities.results.Result;
import HRMS.Hrms.core.utilities.results.SuccessDataResult;
import HRMS.Hrms.core.utilities.results.SuccessResult;
import HRMS.Hrms.dataAccess.abstracts.CandidateDao;

import HRMS.Hrms.entities.concretes.Candidate;

@Service
public class CandidateManager implements CandidateService {
	private CandidateDao candidatedao;
    private ValidationService validationservice;
	

    
    @Autowired
	public CandidateManager(CandidateDao candidatedao, ValidationService validationservice) {
		super();
		this.candidatedao = candidatedao;
		this.validationservice = validationservice;
	}

	

	@Override
	public DataResult<List<Candidate>> getAll() {
		
		return new SuccessDataResult<List<Candidate>>(this.candidatedao.findAll());
	}

	@Override
	public Result add(Candidate candidate) {
		var checkEmail=this.findByEmail(candidate.getEmail()).getData().size() !=0;
		var checkidentityNumber=this.findByIdentityNumber(candidate.getIdentityNumber()).getData().size() !=0;
		var checkValidateByPersonal=!this.checkValidateByPersonalInfo(candidate.getIdentityNumber(), candidate.getFirstName(), 
				candidate.getLastName(), candidate.getBirth_Date()).getData();
		 var checkFields=!CandidateCheckHelper.allFieldsAreRequried(candidate);
		 
		 if(checkEmail||checkidentityNumber||checkValidateByPersonal||checkFields) {
			 
			 String errorMessage="";
		 
		 if(checkEmail||checkidentityNumber) {
			 errorMessage+="Email ve Tc No zaten mevcut";
		 }
	     if(checkValidateByPersonal) {
	    	 errorMessage+="Gerçek bir insan değil.";
	     }
	     if(checkFields) {
	    	 errorMessage+="Tüm Alanlar zorunludur";
	     }
		return new ErrorResult(errorMessage);
		 }
		this.candidatedao.save(candidate);
		return new SuccessResult("Kayıt başarıyla gerçekleşti");
	}

	
	@Override
	public DataResult<List<Candidate>> findByIdentityNumber(String identityNumber) {
		//
		return new SuccessDataResult<List<Candidate>>(this.candidatedao.findByIdentityNumber(identityNumber));
	}

	@Override
	public DataResult<List<Candidate>> findByEmail(String email) {
		
		return new  SuccessDataResult<List<Candidate>>(this.candidatedao.findByEmail(email));
	}

	
	



	@Override
	public DataResult<Boolean> checkValidateByPersonalInfo(String identityNumber, String firstName, String lastName,
			Date birth_Date) {
		return new DataResult<>(this.validationservice.validationByMernis(identityNumber, firstName, lastName, birth_Date),true);
	}

	

}
