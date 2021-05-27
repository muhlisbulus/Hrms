package HRMS.Hrms.core.utilities.activation;

import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class ActivationManager implements ActivationService {







	@Override
	public void sendLink(String email) {
		UUID uuid = UUID.randomUUID();
		String activationLink = "https://hrmsverificationmail/" + uuid.toString();
		System.out.println("Verification link has been sent to " + email );
		System.out.println("Please click on the link to verify your account:  " + activationLink );
	}

	@Override
	public String sendCode() {
	
		 UUID uuid = UUID.randomUUID();
		String activationCode = uuid.toString();
		System.out.println("Your activation code:  " +activationCode );
		return activationCode;
	}

}
