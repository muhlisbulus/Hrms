package HRMS.Hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import HRMS.Hrms.entities.concretes.Job;

public interface JobDao extends JpaRepository<Job, Integer> {
	List<Job> findByActiveTrue();
	
	List<Job> findByActiveTrueAndEmployer_CompanyName(String companyName);
	
	List<Job> findByActiveTrueOrderByCreatedTimeDesc();
	
	Job findByIdAndActiveTrue(int id);

}
