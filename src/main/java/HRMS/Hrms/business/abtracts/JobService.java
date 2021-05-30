package HRMS.Hrms.business.abtracts;

import java.util.List;



import HRMS.Hrms.core.utilities.results.DataResult;
import HRMS.Hrms.core.utilities.results.Result;
import HRMS.Hrms.entities.concretes.Job;

public interface JobService {
	DataResult<List<Job>> getAll();
	
	Result add( Job job);
	
    DataResult<List<Job>> findByActiveTrue();
	
    DataResult<List<Job>>findByEmployer_IdAndActiveTrue( String companyName);
	
   DataResult<List<Job>>findByActiveTrueOrderByCreatedTimeDesc();
	
	DataResult<Job> findByIdAndActiveTrue(int id);

}
