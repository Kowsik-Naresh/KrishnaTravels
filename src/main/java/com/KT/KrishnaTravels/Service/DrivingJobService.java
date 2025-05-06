package com.KT.KrishnaTravels.Service;

import java.util.List;

import com.KT.KrishnaTravels.Modals.DrivingJobBean;

public interface DrivingJobService {
	
	DrivingJobBean saveDrivingJob(DrivingJobBean drivingJob);
	
	DrivingJobBean getDrivingJobById(Long drivingJobId);
	
	List<DrivingJobBean> getAllDrivingJobs();

}
