package com.KT.KrishnaTravels.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.KT.KrishnaTravels.Modals.DrivingJobBean;
import com.KT.KrishnaTravels.Service.DrivingJobService;
import com.KT.KrishnaTravels.predefind.KrishnaTravelsResponseBean;

@RestController
@RequestMapping(value="/drivingJob")
public class DrivingJobController {
	
	@Autowired DrivingJobService drivingJobService;
	
	@GetMapping
	public String getDrivingJobModule() {
		return "driving jobs";
	}
	
	@PostMapping("/createDrivingJob")
	public KrishnaTravelsResponseBean createDrivingJob(@RequestBody  DrivingJobBean drivingJobBean) {
		KrishnaTravelsResponseBean response=new KrishnaTravelsResponseBean();
		response.setData(drivingJobService.saveDrivingJob(drivingJobBean));
		return response;
	}
	
	@GetMapping("/getAllDrivingJobs")
	public KrishnaTravelsResponseBean getAllDrivingJobs() {
		KrishnaTravelsResponseBean response=new KrishnaTravelsResponseBean();
		response.setData(drivingJobService.getAllDrivingJobs());
		return response;
	
	}

}
