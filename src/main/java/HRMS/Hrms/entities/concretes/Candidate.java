package HRMS.Hrms.entities.concretes;





import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

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
	@NotBlank(message="isim alanı boş olamaz")
	
	@Column(name="first_name")
	
	private String firstName;
	
	@NotBlank(message="Soyisim alanı boş olamaz")
	@Column(name="last_name")
	
	private String lastName;
	
	@NotBlank(message="TC Kimlik Numarası Alanı Boş Olamaz") 
	@Size(min = 11, max=11, message = "TCKimlik No 11 hane olmalıdır")
	@Column(name="identity_number")
	private String identityNumber;
	
	@NotBlank
	@Column(name="birth_date")
	private String birth_Date;

	
	

}
