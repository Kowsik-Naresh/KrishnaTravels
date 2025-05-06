package com.KT.KrishnaTravels.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.KT.KrishnaTravels.Modals.DrivingJobBean;
import com.KT.KrishnaTravels.Repository.DrivingJobRepo;
import com.KT.KrishnaTravels.Service.DrivingJobService;

@Service
public class DrivingJobServiceImp implements DrivingJobService{
	
	@Autowired DrivingJobRepo drivingJobRepo;
	
	@Override
	public DrivingJobBean saveDrivingJob(DrivingJobBean drivingJob) {
		return drivingJobRepo.save(drivingJob);
	}

	@Override
	public DrivingJobBean getDrivingJobById(Long drivingJobId) {
		return drivingJobRepo.findByJobId(drivingJobId);
	}

	@Override
	public List<DrivingJobBean> getAllDrivingJobs() {
		
		return drivingJobRepo.findAll();
	}

}
