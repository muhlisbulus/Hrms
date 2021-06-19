package HRMS.Hrms.api.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HRMS.Hrms.business.abtracts.WorkExperienceService;
import HRMS.Hrms.core.utilities.results.DataResult;
import HRMS.Hrms.core.utilities.results.Result;

import HRMS.Hrms.entities.dtos.WorkExperienceDto;

@RestController
@RequestMapping("/api/works")
@CrossOrigin
public class WorkExperiencesController {
	private WorkExperienceService experienceService;

	@Autowired
	public WorkExperiencesController(WorkExperienceService experienceService) {
		super();
		this.experienceService = experienceService;
	}
	@PostMapping("/add")
	public Result add(@Valid @RequestBody WorkExperienceDto workexperience) {
		return this.experienceService.add(workexperience);
		
	}
	@GetMapping("/getAll")
	DataResult<List<WorkExperienceDto>> getAll(){
		return this.experienceService.getAll();
		
	}
	


}
