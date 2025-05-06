package com.KT.KrishnaTravels.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.KT.KrishnaTravels.Modals.DrivingJobBean;

public interface DrivingJobRepo extends JpaRepository<DrivingJobBean,Long> {
	
	DrivingJobBean save(DrivingJobBean job);
	
	List<DrivingJobBean> findAll();
	
	DrivingJobBean findByJobId(Long drivingJobId);

}
