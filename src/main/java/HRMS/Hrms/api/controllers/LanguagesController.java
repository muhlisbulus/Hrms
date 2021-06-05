package HRMS.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HRMS.Hrms.business.abtracts.LanguageService;
import HRMS.Hrms.core.utilities.results.DataResult;
import HRMS.Hrms.core.utilities.results.Result;
import HRMS.Hrms.entities.concretes.Language;
@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
	private LanguageService languageService;
@Autowired
public LanguagesController(LanguageService languageService) {
		super();
		this.languageService = languageService;
	}

@PostMapping("/add")
public Result add(@RequestBody Language language) {
	return this.languageService.add(language);
}

	@GetMapping("getAll")
	public DataResult<List<Language>> getAll(){
		return this.languageService.getAll();
	}


}
