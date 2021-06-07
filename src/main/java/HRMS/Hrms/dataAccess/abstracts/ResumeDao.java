package HRMS.Hrms.dataAccess.abstracts;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import HRMS.Hrms.entities.concretes.Resume;
import HRMS.Hrms.entities.dtos.ResumeGetDto;


public interface ResumeDao extends JpaRepository<Resume, Integer> {
	
	List<ResumeGetDto> findAllByCandidateUserId(int id);
	
	
	
}
