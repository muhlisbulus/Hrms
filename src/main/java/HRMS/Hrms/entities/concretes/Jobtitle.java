package HRMS.Hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity




@Table (name="job_titles")
public class Jobtitle {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="title")
	private String title;
	
	public Jobtitle() {
		super();
	}
	public Jobtitle(int id, String title) {
		super();
		this.id = id;
		this.title = title;
	}
	

}
