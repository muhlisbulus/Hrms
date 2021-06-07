package HRMS.Hrms.business.concretes;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;

import HRMS.Hrms.business.abtracts.ImageService;
import HRMS.Hrms.core.utilities.CloudinaryService;
import HRMS.Hrms.core.utilities.results.DataResult;
import HRMS.Hrms.core.utilities.results.Result;
import HRMS.Hrms.core.utilities.results.SuccessDataResult;
import HRMS.Hrms.core.utilities.results.SuccessResult;
import HRMS.Hrms.dataAccess.abstracts.ImageDao;
import HRMS.Hrms.entities.concretes.Image;

@Service
public class ImageManager implements ImageService {
	
	private ImageDao imageDao;
	private CloudinaryService cloudinaryservice;

	@Autowired
	public ImageManager(ImageDao imageDao) {
		super();
		this.imageDao = imageDao;
	}

	@Override
	public Result add(Image image, MultipartFile multipartFile) throws IOException {
		Map photoMap = cloudinaryservice.photoUpload(multipartFile);
		image.setImageUrl(photoMap.get("url").toString());
		 this.imageDao.save(image);
		 return new SuccessResult("Foto eklendi");
	}

	



	

	
	

	
}
