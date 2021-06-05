package HRMS.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HRMS.Hrms.business.abtracts.TechnologyService;
import HRMS.Hrms.core.utilities.results.DataResult;
import HRMS.Hrms.core.utilities.results.Result;
import HRMS.Hrms.entities.concretes.Technology;

@RestController
@RequestMapping("/api/technlogies")
public class TechnlogiesController {
private TechnologyService technologyService;

@Autowired
public TechnlogiesController(TechnologyService technologyService) {
	super();
	this.technologyService = technologyService;
}
@PostMapping("/add")
public Result add(@RequestBody Technology technology) {
	return this.technologyService.add(technology);
	
}
@GetMapping("/getAll")
public DataResult<List<Technology>> getAll(){
	return this.technologyService.getAll();
	
}

}
