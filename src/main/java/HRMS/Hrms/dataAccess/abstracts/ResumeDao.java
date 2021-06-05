package HRMS.Hrms.dataAccess.abstracts;



import org.springframework.data.jpa.repository.JpaRepository;


import HRMS.Hrms.entities.concretes.Resume;


public interface ResumeDao extends JpaRepository<Resume, Integer> {
	
	
	
}
