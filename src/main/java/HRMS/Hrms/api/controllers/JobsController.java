package HRMS.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import HRMS.Hrms.business.abtracts.JobService;
import HRMS.Hrms.core.utilities.results.DataResult;
import HRMS.Hrms.core.utilities.results.Result;
import HRMS.Hrms.entities.concretes.Job;

@RestController
@RequestMapping("/api/jobs")
public class JobsController {
	private JobService jobService;

	@Autowired
	public JobsController( JobService jobService) {
		super();
		this.jobService = jobService;
	}
	@GetMapping("/getall")
	public DataResult<List<Job>> getAll(){
		return this.jobService.getAll();
	}
	@GetMapping("/add")
	public Result add(@RequestBody Job job) {
		return this.jobService.add(job);
		
	}
	@GetMapping("/findByActiveTrue")
	public DataResult<List<Job>> findByActiveTrue(){
		return this.jobService.findByActiveTrue();
		
	}
	@GetMapping("/findByEmployer_IdAndActiveTrue")
	public DataResult<List<Job>>findByEmployer_IdAndActiveTrue(@RequestParam int employerId){
		return this.findByEmployer_IdAndActiveTrue( employerId);
	}
	@GetMapping("/findByActiveTrueOrderByCreatedTimeDesc")
	public DataResult<List<Job>>findByTrueActiveOrderByCreatedTimeDesc(){
		return this.jobService.findByActiveTrueOrderByCreatedTimeDesc();
	}
	@GetMapping("/findByIdAndActiveTrue")
	public DataResult<Job> findByIdAndActiveTrue(int id){
		return this.findByIdAndActiveTrue(id);
		
	}
	
}
