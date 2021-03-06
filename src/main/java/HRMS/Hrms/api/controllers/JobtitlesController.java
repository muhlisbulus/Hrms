package HRMS.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HRMS.Hrms.business.abtracts.JobtitleService;
import HRMS.Hrms.core.utilities.results.DataResult;

import HRMS.Hrms.entities.concretes.Jobtitle;

@RestController
@RequestMapping("/api/titles")
@CrossOrigin

public class JobtitlesController {
	
	private JobtitleService jobtitleService;
	
    @Autowired
	public JobtitlesController(JobtitleService jobtitleService) {
		super();
		this.jobtitleService = jobtitleService;
	}
    @GetMapping("/getall")
	public DataResult<List<Jobtitle>> getAll() {
		
		return this.jobtitleService.getAll();
	}
    
}
