package HRMS.Hrms.mernisService;

import java.util.Date;

public class FakeService {
	public boolean ValidateByPersonalInfo(String identityNumber, String firstName, String lastName, String birth_Date)
	{
		System.out.println(firstName + " " + lastName + " is valid person." );
		return true;
	}

}
