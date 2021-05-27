package HRMS.Hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HRMS.Hrms.business.abtracts.ActivaitonCodeService;
import HRMS.Hrms.core.utilities.results.Result;
import HRMS.Hrms.core.utilities.results.SuccessResult;
import HRMS.Hrms.dataAccess.abstracts.ActivationCodeDao;
import HRMS.Hrms.entities.concretes.ActivationCode;

@Service
public class ActivationCodeManager implements ActivaitonCodeService {
	
	private ActivationCodeDao activationdao;

	@Autowired
	public ActivationCodeManager(ActivationCodeDao activationdao) {
		super();
		this.activationdao = activationdao;
	}

	@Override
	public Result add(ActivationCode code) {
		this.activationdao.save(code);
		
		return new SuccessResult("Activation code save");
	}

}
