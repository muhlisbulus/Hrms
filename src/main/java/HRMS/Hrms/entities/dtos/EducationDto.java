package HRMS.Hrms.entities.dtos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EducationDto {
	private int id;
	private int resumeId;
	private String schoolName;
	private String department;
	private Date startYearOfSchool;
	private Date endYearOfSchool;

}
