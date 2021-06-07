package HRMS.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HRMS.Hrms.business.abtracts.TechnologyService;
import HRMS.Hrms.core.utilities.dtoConverter.DtoConverterService;
import HRMS.Hrms.core.utilities.results.DataResult;
import HRMS.Hrms.core.utilities.results.Result;
import HRMS.Hrms.core.utilities.results.SuccessDataResult;
import HRMS.Hrms.core.utilities.results.SuccessResult;
import HRMS.Hrms.dataAccess.abstracts.TechnologyDao;
import HRMS.Hrms.entities.concretes.Technology;
import HRMS.Hrms.entities.dtos.TechnologyDto;

@Service
public class TechnologyManager implements TechnologyService {
	private TechnologyDao technologyDao; 
	private DtoConverterService dtoConverterService;
	
	@Autowired
	public TechnologyManager(TechnologyDao technologyDao, DtoConverterService dtoConverterService) {
		super();
		this.technologyDao = technologyDao;
		this.dtoConverterService = dtoConverterService;
	}

	

	

	@Override
	public Result add(TechnologyDto technologyDto) {
		technologyDao.save((Technology) dtoConverterService.dtoClassConverter(technologyDto, Technology.class));
		return new SuccessResult("Başarıyla eklendi");
	}

	@Override
	public DataResult<List<TechnologyDto>> getAll() {
		
		return new SuccessDataResult<List<TechnologyDto>>(this.dtoConverterService.dtoConverter(this.technologyDao.findAll(), TechnologyDto.class));
	}

}
