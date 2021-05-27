package HRMS.Hrms.business.abtracts;

import java.util.List;

import HRMS.Hrms.core.utilities.results.DataResult;
import HRMS.Hrms.core.utilities.results.Result;
import HRMS.Hrms.entities.concretes.Jobtitle;

public interface JobtitleService {
	
	    Result add(Jobtitle jobtitle );
	    DataResult<List<Jobtitle>> getAll();
	    DataResult<List<Jobtitle>> getByJobTitle(String title);
	    
	
	
	
	

	

}
