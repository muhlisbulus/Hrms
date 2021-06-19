package HRMS.Hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler", "jobs" })
@Table(name="way_of_workings")
public class WayOfWorking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="typeofwork_title")
	private String workingType;

	@JsonIgnore
	@OneToMany(mappedBy = "wayOfWorking")
	private List<Job> jobs;
	
}
