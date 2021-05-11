package HRMS.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HRMS.Hrms.business.abtracts.JobtitleService;
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
	public List<Jobtitle> getAll() {
		// TODO Auto-generated method stub
		return this.jobtitledao.findAll();
	}
	

}
