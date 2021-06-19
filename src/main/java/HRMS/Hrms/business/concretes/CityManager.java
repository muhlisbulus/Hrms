package HRMS.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HRMS.Hrms.business.abtracts.CityService;
import HRMS.Hrms.core.utilities.results.DataResult;
import HRMS.Hrms.core.utilities.results.SuccessDataResult;
import HRMS.Hrms.dataAccess.abstracts.CityDao;
import HRMS.Hrms.entities.concretes.City;

@Service
public class CityManager implements CityService {
	private CityDao cityDao;

	@Autowired
	public CityManager(CityDao cityDao) {
		super();
		this.cityDao = cityDao;
	}

	@Override
	public DataResult<List<City>> getAll() {
	
		return new SuccessDataResult<List<City>>(this.cityDao.findAll());
	}

}
