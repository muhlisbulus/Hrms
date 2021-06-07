package HRMS.Hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

@Table(name="cities")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "jobs"})
public class City {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int cityId;
	
    @NotBlank(message ="Bu Alan Boş Geçilemez")
	@Column(name="city_name")
	private String cityName;
	
    
	@OneToMany(mappedBy = "city")
	private List<Job> jobs;
	
	

}
