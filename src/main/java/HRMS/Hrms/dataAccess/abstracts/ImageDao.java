package HRMS.Hrms.dataAccess.abstracts;



import org.springframework.data.jpa.repository.JpaRepository;

import HRMS.Hrms.entities.concretes.Image;

public interface ImageDao extends JpaRepository<Image, Integer> {
	


}
