package HRMS.Hrms.business.abtracts;

import java.util.List;

import HRMS.Hrms.core.utilities.results.DataResult;
import HRMS.Hrms.core.utilities.results.Result;
import HRMS.Hrms.entities.concretes.Language;

public interface LanguageService {
	Result add(Language language);
	
	DataResult<List<Language>> getAll();

}
