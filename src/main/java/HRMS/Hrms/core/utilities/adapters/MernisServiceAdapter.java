
package HRMS.Hrms.core.utilities.adapters;



import java.util.Date;

import org.springframework.stereotype.Service;


@Service
public class MernisServiceAdapter implements ValidationService {

	@Override
	public Boolean validationByMernis(String identityNumber, String firstName, String lastName, Date birth_Date) {
		return true;
		
		
	}

}
