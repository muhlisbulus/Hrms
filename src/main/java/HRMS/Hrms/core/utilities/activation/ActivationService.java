package HRMS.Hrms.core.utilities.activation;

public interface ActivationService {
	void sendLink(String email);
	String sendCode();

}
