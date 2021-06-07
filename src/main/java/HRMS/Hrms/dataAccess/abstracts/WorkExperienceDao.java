package HRMS.Hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import HRMS.Hrms.entities.concretes.WorkExperience;

public interface WorkExperienceDao extends JpaRepository<WorkExperience, Integer> {
	List<WorkExperience> findAllByResume_ResumeIdOrderByEndYearOfWorkDesc(int resumeId);
	

}
