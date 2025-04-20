package com.KT.KrishnaTravels.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.KT.KrishnaTravels.Modals.DriverBean;
import com.KT.KrishnaTravels.Repository.DriverRepo;
import com.KT.KrishnaTravels.Service.DriverService;

@Service
public class DriverServiceImp implements DriverService{
    
	@Autowired
	DriverRepo driverRepo;
	
	@Override
	public List<DriverBean> getAllDrivers() {
		
		return driverRepo.findAll();
	}

	@Override
	public DriverBean getDriverByDriverId(Long driverId) {
		return driverRepo.findByDriverId(driverId);
	}

	@Override
	public DriverBean createDriver(DriverBean driver) {
		return driverRepo.save(driver);
	}

}