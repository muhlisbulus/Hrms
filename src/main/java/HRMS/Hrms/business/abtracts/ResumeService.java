package HRMS.Hrms.business.abtracts;

import java.util.List;

import HRMS.Hrms.core.utilities.results.DataResult;
import HRMS.Hrms.core.utilities.results.Result;
import HRMS.Hrms.entities.concretes.Resume;


public interface ResumeService {
	Result add(Resume resume);
	
	DataResult<List<Resume>> getAll();

}
