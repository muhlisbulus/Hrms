package HRMS.Hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import HRMS.Hrms.entities.concretes.Employee;

public interface EmployeeDao extends JpaRepository<Employee,Integer> {
	//List<Employee> findByEmail(String email);

}
