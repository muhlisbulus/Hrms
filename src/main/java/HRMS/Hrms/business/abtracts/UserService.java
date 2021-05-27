package HRMS.Hrms.business.abtracts;

import java.util.List;

import HRMS.Hrms.core.utilities.results.DataResult;
import HRMS.Hrms.entities.concretes.User;

public interface UserService {
    DataResult<List<User>> getAll();
    
    
    
    
	

}
