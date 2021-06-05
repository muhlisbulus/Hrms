package HRMS.Hrms.core.utilities.adapters;

import java.util.Date;

public interface ValidationService {
	
	Boolean validationByMernis(String identityNumber,String firstName,String lastName,Date birth_Date);

}
