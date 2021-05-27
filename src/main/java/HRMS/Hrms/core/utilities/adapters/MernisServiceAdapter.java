
package HRMS.Hrms.core.utilities.adapters;



import org.springframework.stereotype.Service;


@Service
public class MernisServiceAdapter implements ValidationService {

	@Override
	public Boolean validationByMernis(String identityNumber, String firstName, String lastName, String birth_date) {
		return true;
		
		
	}

}
