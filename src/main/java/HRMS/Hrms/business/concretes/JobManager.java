package HRMS.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HRMS.Hrms.business.abtracts.JobService;
import HRMS.Hrms.core.utilities.results.DataResult;
import HRMS.Hrms.core.utilities.results.Result;
import HRMS.Hrms.core.utilities.results.SuccessDataResult;
import HRMS.Hrms.core.utilities.results.SuccessResult;
import HRMS.Hrms.dataAccess.abstracts.JobDao;
import HRMS.Hrms.entities.concretes.Job;


@Service
public class JobManager implements JobService {
	private JobDao jobDao;
	

	@Autowired
	public JobManager(JobDao jobDao) {
		super();
		this.jobDao = jobDao;
	}


	@Override
	public DataResult<List<Job>> getAll() {
		
		return new SuccessDataResult<List<Job>>(this.jobDao.findAll());
	}


	@Override
	public Result add(Job job) {
		this.jobDao.save(job);
		return  new SuccessResult("Başarıyla eklendi");
	}


	@Override
	public DataResult<List<Job>> findByActiveTrue() {
		
		return new SuccessDataResult<List<Job>>(this.jobDao.findByActiveTrue());
	}


	@Override
	public DataResult<List<Job>> findByEmployer_IdAndActiveTrue(String companyName) {
		
		return new SuccessDataResult<List<Job>>(this.jobDao.findByActiveTrueAndEmployer_CompanyName(companyName));
	}


	@Override
	public DataResult<List<Job>> findByActiveTrueOrderByCreatedTimeDesc() {
		
		return new SuccessDataResult<List<Job>>(this.jobDao.findByActiveTrueOrderByCreatedTimeDesc());
	}


	@Override
	public DataResult<Job> findByIdAndActiveTrue(int id) {
		
		return new SuccessDataResult<Job>(this.jobDao.findByIdAndActiveTrue(id)) ;
	}

	

}
