package HRMS.Hrms.api.controllers;



import java.util.List;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RestController;

import HRMS.Hrms.business.abtracts.CandidateService;
import HRMS.Hrms.core.utilities.results.DataResult;
import HRMS.Hrms.core.utilities.results.Result;
import HRMS.Hrms.entities.concretes.Candidate;


@RestController
@RequestMapping("/api/candidates")
public class CandidatesController {
	private CandidateService  candidateService;

	@Autowired
	public CandidatesController(CandidateService candidateService) {
		super();
		this.candidateService = candidateService;
	}
	
	
	    @GetMapping("/getall")
        public DataResult<List<Candidate>> getAll(){
        	return this.candidateService.getAll();
        	
        }
	    @GetMapping("/getByEmail")
        public DataResult<List<Candidate>> findByEmail(String email){
        	
        return this.candidateService.findByEmail(email);	
        }
	    
	    @GetMapping("/getByIdentity")
	    public DataResult<List<Candidate>> findByIdentityNumber(@RequestParam String identityNumber){
	    
        	 
	        return this.candidateService.findByIdentityNumber(identityNumber.trim());	
	        }
	    @PostMapping(value="/add")
	    public Result add(@Valid @RequestBody Candidate candidate) {
	    	return this.candidateService.add(candidate);
	    	
	    	
	    }
	    
		}
	    
	
	

