package HRMS.Hrms.business.abtracts;

import java.util.List;

import HRMS.Hrms.core.utilities.results.DataResult;
import HRMS.Hrms.core.utilities.results.Result;
import HRMS.Hrms.entities.concretes.Technology;

public interface TechnologyService {
	Result add(Technology technology);
	
	DataResult<List<Technology>> getAll();

}
