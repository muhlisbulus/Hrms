package HRMS.Hrms.entities.dtos;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WorkExperienceDto {
	@JsonIgnore
	private int id;
	private int resumeId;
	private String workPlaceName;
	private Date startYearOfWork;
    private int jobTitleId;
}
