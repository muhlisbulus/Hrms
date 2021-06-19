package HRMS.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HRMS.Hrms.business.abtracts.WorkTimeService;
import HRMS.Hrms.core.utilities.results.DataResult;
import HRMS.Hrms.core.utilities.results.SuccessDataResult;
import HRMS.Hrms.dataAccess.abstracts.WorkTimeDao;
import HRMS.Hrms.entities.concretes.WorkTime;

@Service
public class WorkTimeManager implements WorkTimeService {
	private WorkTimeDao workTimeDao;

	 @Autowired
	public WorkTimeManager(WorkTimeDao workTimeDao) {
		super();
		this.workTimeDao = workTimeDao;
	}

	@Override
	public DataResult<List<WorkTime>> getAll() {
		
		return new SuccessDataResult<List<WorkTime>>(this.workTimeDao.findAll());
	}

}
