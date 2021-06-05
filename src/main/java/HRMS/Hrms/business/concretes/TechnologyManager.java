package HRMS.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HRMS.Hrms.business.abtracts.TechnologyService;
import HRMS.Hrms.core.utilities.results.DataResult;
import HRMS.Hrms.core.utilities.results.Result;
import HRMS.Hrms.dataAccess.abstracts.TechnologyDao;
import HRMS.Hrms.entities.concretes.Technology;

@Service
public class TechnologyManager implements TechnologyService {
	private TechnologyDao technologyDao; 

	@Autowired
	public TechnologyManager(TechnologyDao technologyDao) {
		super();
		this.technologyDao = technologyDao;
	}

	@Override
	public Result add(Technology technology) {
		this.technologyDao.save(technology);
		return null;
	}

	@Override
	public DataResult<List<Technology>> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
