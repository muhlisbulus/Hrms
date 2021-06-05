package HRMS.Hrms.api.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HRMS.Hrms.business.abtracts.EmployerService;
import HRMS.Hrms.core.utilities.results.DataResult;
import HRMS.Hrms.core.utilities.results.Result;
import HRMS.Hrms.entities.concretes.Employer;


@RestController
@RequestMapping("/api/employers")

public class EmployerController {
	EmployerService employerService;

	@Autowired
	public EmployerController(EmployerService employerService) {
		super();
		this.employerService = employerService;
	}
	@GetMapping("/getall")
	public DataResult<List<Employer>> getAll(){
		return this.employerService.getAll();
		
	}
	@GetMapping("/getByEmail")
	public DataResult<List<Employer>> findByEmail(String email){
		return this.employerService.findByEmail(email);
	}
	@PostMapping("/add")
	public Result add( @Valid @RequestBody Employer employer) {
		return this.employerService.add(employer);
	}
	
	

}
