package HRMS.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HRMS.Hrms.business.abtracts.WorkTimeService;
import HRMS.Hrms.core.utilities.results.DataResult;
import HRMS.Hrms.entities.concretes.WorkTime;

@RestController
@RequestMapping("/api/worktimes")
@CrossOrigin
public class WorkTimesController {
	
	private WorkTimeService workTimeService;
	
	@Autowired
	public WorkTimesController(WorkTimeService workTimeService) {
	
		this.workTimeService = workTimeService;
	}

	@GetMapping("/getAll")
	public DataResult<List<WorkTime>> getAll(){
		return this.workTimeService.getAll();
	}

}
