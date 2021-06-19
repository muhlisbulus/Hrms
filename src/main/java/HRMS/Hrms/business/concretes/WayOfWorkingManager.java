package HRMS.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HRMS.Hrms.business.abtracts.WayOfWorkService;
import HRMS.Hrms.core.utilities.results.DataResult;
import HRMS.Hrms.core.utilities.results.Result;
import HRMS.Hrms.core.utilities.results.SuccessDataResult;
import HRMS.Hrms.core.utilities.results.SuccessResult;
import HRMS.Hrms.dataAccess.abstracts.WayOfWorkingDao;
import HRMS.Hrms.entities.concretes.WayOfWorking;

@Service
public class WayOfWorkingManager implements WayOfWorkService {
	private WayOfWorkingDao workingDao;

	@Autowired
	public WayOfWorkingManager(WayOfWorkingDao workingDao) {
		super();
		this.workingDao = workingDao;
	}

	@Override
	public DataResult<List<WayOfWorking>> getAll() {
		
		return new SuccessDataResult<List<WayOfWorking>>(this.workingDao.findAll());
	}

	@Override
	public Result add(WayOfWorking working) {
		this.workingDao.save(working);
		return new SuccessResult("Başarıyla eklendi");
	}

}
