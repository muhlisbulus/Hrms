package HRMS.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HRMS.Hrms.entities.concretes.City;

public interface CityDao extends JpaRepository<City, Integer> {

}
