package HRMS.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HRMS.Hrms.business.abtracts.JobtitleService;
import HRMS.Hrms.core.utilities.results.DataResult;
import HRMS.Hrms.core.utilities.results.ErrorResult;
import HRMS.Hrms.core.utilities.results.Result;
import HRMS.Hrms.core.utilities.results.SuccessDataResult;
import HRMS.Hrms.core.utilities.results.SuccessResult;
import HRMS.Hrms.dataAccess.abstracts.JobtitleDao;
import HRMS.Hrms.entities.concretes.Jobtitle;

@Service
public class JobtitleManager implements JobtitleService {
	
	private JobtitleDao jobtitledao;
	
		//
     @Autowired
	public JobtitleManager(JobtitleDao jobtitledao) {
		super();
		this.jobtitledao = jobtitledao;
	}

	@Override
	public DataResult<List<Jobtitle>> getAll() {
		return new SuccessDataResult<List<Jobtitle>>
		( this.jobtitledao.findAll());
			}

	@Override
	public Result add(Jobtitle jobtitle) {
		if(getByJobTitle(jobtitle.getTitle()).getData()!=null) {
			return new ErrorResult( jobtitle.getTitle()+"Jobtitle eklenemedi");
		}
		this.jobtitledao.save(jobtitle);
		return new SuccessResult("JobTitle Eklendi");
	}

	@Override
	public DataResult<List<Jobtitle>> getByJobTitle(String title) {
		
		return new SuccessDataResult<List<Jobtitle>>(this.jobtitledao.findByTitle(title));
	}

	
}