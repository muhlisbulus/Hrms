package HRMS.Hrms.dataAccess.abstracts;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import HRMS.Hrms.entities.concretes.Jobtitle;

public interface JobtitleDao extends JpaRepository<Jobtitle,Integer> {
	
	     List<Jobtitle> findByTitle(String title);
	

}
