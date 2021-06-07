package HRMS.Hrms.entities.dtos;

import java.time.LocalDate;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobPostingDto {
	@JsonIgnore
	private String description;
	private int maxSalary;
	private int minSalary;
	private int openPositions;
	private boolean active;
	private LocalDate latestApplyTime;
	private Date createdTime;

}
