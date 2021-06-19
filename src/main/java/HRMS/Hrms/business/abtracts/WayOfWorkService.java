package HRMS.Hrms.business.abtracts;

import java.util.List;

import HRMS.Hrms.core.utilities.results.DataResult;
import HRMS.Hrms.core.utilities.results.Result;
import HRMS.Hrms.entities.concretes.WayOfWorking;

public interface WayOfWorkService {
	
	DataResult<List<WayOfWorking>> getAll();
	
	Result add(WayOfWorking working);

}
