package HRMS.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HRMS.Hrms.business.abtracts.ResumeService;
import HRMS.Hrms.core.utilities.results.DataResult;
import HRMS.Hrms.core.utilities.results.Result;

import HRMS.Hrms.entities.dtos.ResumeAddDto;
import HRMS.Hrms.entities.dtos.ResumeGetDto;

@RestController
@RequestMapping("/api/resumes")

public class ResumesController {
	private ResumeService resumeService;

	@Autowired
	public ResumesController(ResumeService resumeService) {
		super();
		this.resumeService = resumeService;
	}
	@GetMapping("/add")
	public Result add(ResumeAddDto resume) {
		return this.resumeService.add(resume);
		
	}
	
	@GetMapping("/getAll")
	public DataResult<List<ResumeGetDto>> getAll(){
		return this.resumeService.getAll();
	}
	
	@GetMapping("/findAllByCandidateUserId")
	public DataResult<List<ResumeGetDto>> findAllByCandidateUserId(int id){
		return this.resumeService.findAllByCandidateUserId(id);
				
		
	}

}
