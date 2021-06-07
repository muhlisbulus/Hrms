package HRMS.Hrms.business.abtracts;

import java.util.List;

import HRMS.Hrms.core.utilities.results.DataResult;
import HRMS.Hrms.core.utilities.results.Result;

import HRMS.Hrms.entities.dtos.LanguageDto;

public interface LanguageService {
	Result add(LanguageDto languageDto);
	
	DataResult<List<LanguageDto>> getAll();

}
