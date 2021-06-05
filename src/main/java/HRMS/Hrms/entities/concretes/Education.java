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
@Table(name="educations")

public class Education {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@NotBlank(message ="Bu Alan Boş Geçilemez")
	@Column(name = "school_name")
	private String schoolName;
	
	@NotBlank(message ="Bu Alan Boş Geçilemez")
	@Column(name = "department")
	private String department;
	
	@NotBlank(message ="Bu Alan Boş Geçilemez")
	@Column(name =  "start_year_school")
	private Date startYearOfSchool;
	
	@Column(name ="end_year_school")
	private Date endYearOfSchool;
	
	@ManyToOne()
	@JoinColumn(name="resume_id")
	private Resume resume;
	

}
