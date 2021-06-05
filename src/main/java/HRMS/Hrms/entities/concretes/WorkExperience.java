package HRMS.Hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="work_experiences")
public class WorkExperience {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="id")
	private int id;
	
	@NotBlank(message ="Bu Alan Boş Geçilemez")
	@Column(name="work_place_name")
	private String workPlaceName;
	
	@NotBlank(message ="Bu Alan Boş Geçilemez")
	@Column(name="start_year_work")
	private Date startYearOfWork;
	
	@Column(name="end_year_work")
	private Date endYearOfWork;
	
	@ManyToOne()
	@JoinColumn(name="job_title_id")
	private Jobtitle jobtitle;
	
	@ManyToOne()
	@JoinColumn(name="resume_id")
	private Resume resume;


}
