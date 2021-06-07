package HRMS.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HRMS.Hrms.business.abtracts.LanguageService;
import HRMS.Hrms.core.utilities.dtoConverter.DtoConverterService;
import HRMS.Hrms.core.utilities.results.DataResult;
import HRMS.Hrms.core.utilities.results.Result;
import HRMS.Hrms.core.utilities.results.SuccessDataResult;
import HRMS.Hrms.core.utilities.results.SuccessResult;
import HRMS.Hrms.dataAccess.abstracts.LanguageDao;
import HRMS.Hrms.entities.concretes.Language;
import HRMS.Hrms.entities.dtos.LanguageDto;

@Service
public class LanguageManager implements LanguageService {
	private LanguageDao languageDao;
    private DtoConverterService dtoConverterService;
	
    @Autowired
	public LanguageManager(LanguageDao languageDao, DtoConverterService dtoConverterService) {
		super();
		this.languageDao = languageDao;
		this.dtoConverterService = dtoConverterService;
	}

	

	@Override
	public Result add(LanguageDto languageDto) {
		languageDao.save((Language)dtoConverterService.dtoClassConverter(languageDto, Language.class));
		return new SuccessResult("Başarıyla Eklendi");
	}

	@Override
	public DataResult<List<LanguageDto>> getAll() {
		
		return new SuccessDataResult<List<LanguageDto>>(this.dtoConverterService.dtoConverter(this.languageDao.findAll(), LanguageDto.class));
	}

}
