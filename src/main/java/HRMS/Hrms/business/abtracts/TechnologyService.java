package HRMS.Hrms.business.abtracts;

import java.util.List;

import HRMS.Hrms.core.utilities.results.DataResult;
import HRMS.Hrms.core.utilities.results.Result;

import HRMS.Hrms.entities.dtos.TechnologyDto;

public interface TechnologyService {
	Result add(TechnologyDto technologyDto);
	
	DataResult<List<TechnologyDto>> getAll();

}
