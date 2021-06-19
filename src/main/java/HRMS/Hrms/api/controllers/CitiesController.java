package HRMS.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HRMS.Hrms.business.abtracts.CityService;
import HRMS.Hrms.core.utilities.results.DataResult;
import HRMS.Hrms.entities.concretes.City;

@RestController
@RequestMapping("/api/cities")
@CrossOrigin
public class CitiesController {
	private CityService cityService;
	
	@Autowired
	 public CitiesController(CityService cityService) {
		super();
		this.cityService = cityService;
	}
	
    @GetMapping("/getAll")
	public DataResult<List<City>> getAll(){
		
		return this.cityService.getAll();
		 
	 }

}
