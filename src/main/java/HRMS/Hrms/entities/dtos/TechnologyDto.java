package HRMS.Hrms.entities.dtos;


import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class TechnologyDto {
	@JsonIgnore
	private int id;
	private int resumeId;
	private String technologyName;

}
