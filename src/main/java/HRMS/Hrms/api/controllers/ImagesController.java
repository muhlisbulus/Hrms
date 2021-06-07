package HRMS.Hrms.api.controllers;

import java.io.IOException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import HRMS.Hrms.business.abtracts.ImageService;
import HRMS.Hrms.core.utilities.results.Result;
import HRMS.Hrms.entities.concretes.Image;

@RestController
@RequestMapping("/api/images")
public class ImagesController {

	private ImageService imageService;
	

	@Autowired
	public ImagesController(@RequestBody ImageService imageService) {
		super();
		this.imageService = imageService;
	}
	@PostMapping("/add")
	public Result add(@ModelAttribute("image") Image image,@RequestParam ("multipartFile") MultipartFile multipartFile) throws IOException {
		
		return this.imageService.add(image, multipartFile);
	}
	
		
}
