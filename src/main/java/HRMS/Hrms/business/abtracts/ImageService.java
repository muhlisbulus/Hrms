package HRMS.Hrms.business.abtracts;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import HRMS.Hrms.core.utilities.results.Result;
import HRMS.Hrms.entities.concretes.Image;

public interface ImageService {
	
     
	Result add(Image image,MultipartFile multipartFile) throws IOException;
	

	
	
	
	

}
