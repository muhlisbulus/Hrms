package HRMS.Hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@PrimaryKeyJoinColumn(name="employer_id",referencedColumnName = "id")
@Table(name="employers")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "jobs"})
public class Employer extends User {
 
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="web_adress")
	private String web;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	@Column(name="is_activated")
	private boolean isActivated;
	
	@OneToMany(mappedBy = "employer")
	private List<Job> jobs;
	

}
