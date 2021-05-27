package HRMS.Hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import HRMS.Hrms.entities.concretes.Candidate;

public interface CandidateDao extends JpaRepository<Candidate,Integer>{
	
	List<Candidate> findByIdentityNumber(String identityNumber);
	List<Candidate> findByEmail(String email);


}
