package HRMS.Hrms.entities.dtos;



import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResumeAddDto {
	
	@JsonProperty(access = Access.READ_ONLY)
	private int resumeId;
	private int candidateId;
	private int imageId;
	private String githubAdress;
	private String linkEdin;
	private String coverLetter;

	
}
