package HRMS.Hrms.entities.concretes;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Data
@EqualsAndHashCode(callSuper = false) 
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="candidates")
@PrimaryKeyJoinColumn(name = "id",referencedColumnName = "id")
public class Candidate extends User{
	
	@Column(name="first_name")
	
	@NotBlank
	private String firstName;
	
	
	@Column(name="last_name")
	@NotBlank
	private String lastName;
	
	
	@Column(name="identity_number")
	@NotBlank
	private String identityNumber;
	
	
	@Column(name="birth_date")
	@NotBlank
	private Date birth_Date;

	
	

}
