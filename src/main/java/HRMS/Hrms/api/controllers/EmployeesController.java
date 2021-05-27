package HRMS.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


import HRMS.Hrms.business.abtracts.EmployeeService;
import HRMS.Hrms.core.utilities.results.DataResult;
import HRMS.Hrms.entities.concretes.Employee;


public class EmployeesController {
	private final EmployeeService employeeService;
	@Autowired
	public EmployeesController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	@GetMapping("/getall")
	public DataResult<List<Employee>> getAll() {
		return this.employeeService.getAll();
	}

}
