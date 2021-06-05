package HRMS.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HRMS.Hrms.entities.concretes.Education;

public interface EducationDao extends JpaRepository<Education, Integer> {

}
