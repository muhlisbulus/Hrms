package HRMS.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HRMS.Hrms.business.abtracts.WayOfWorkService;
import HRMS.Hrms.core.utilities.results.DataResult;
import HRMS.Hrms.entities.concretes.WayOfWorking;

@RestController
@RequestMapping("/api/workings")
@CrossOrigin
public class WayOfWorkingController {
	private WayOfWorkService wayOfWorkService;

	@Autowired
	public WayOfWorkingController(WayOfWorkService wayOfWorkService) {
		super();
		this.wayOfWorkService = wayOfWorkService;
	}
	@GetMapping("/getAll")
	public DataResult<List<WayOfWorking>> getAll(){
		return this.wayOfWorkService.getAll();
	}

}
