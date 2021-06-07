package HRMS.Hrms.entities.dtos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import HRMS.Hrms.entities.concretes.Education;
import HRMS.Hrms.entities.concretes.Language;
import HRMS.Hrms.entities.concretes.Technology;
import HRMS.Hrms.entities.concretes.WorkExperience;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResumeGetDto {
	@JsonProperty(access = Access.READ_ONLY)
	private int resumeId;
	private int candidateId;
	private int imageId;
	private String githubAdress;
	private String linkEdin;
	private String coverLetter;
	
	private List<Education> educations;
	private List<Technology> technlogies;
	private List<Language> languages;
	private List<WorkExperience> workExperiences;
 	

}
