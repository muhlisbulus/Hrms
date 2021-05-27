package HRMS.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HRMS.Hrms.entities.concretes.User;

public interface UserDao extends JpaRepository<User,Integer> {
	

}
