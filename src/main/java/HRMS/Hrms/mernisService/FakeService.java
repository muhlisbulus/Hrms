package HRMS.Hrms.mernisService;

public class FakeService {
	public boolean ValidateByPersonalInfo(String identityNumber, String firstName, String lastName, int birth_date)
	{
		System.out.println(firstName + " " + lastName + " is valid person." );
		return true;
	}

}
